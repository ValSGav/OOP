package Notebook.model.impl;

import Notebook.model.IRecord;

public class NotebookRecord implements IRecord {
    private String title;
    private String text;
    private String date;
    private int id;

    public NotebookRecord(String title, String text, int id, String date) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public NotebookRecord(String represent) {
        if (!setFromStringRepresents(represent)) throw new ExceptionInInitializerError("Не удалось инициализировать объект строкой: " + represent);
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String getAStringRepresents() {
        return String.format("%s:%d;%s:%s;%s:%s;%s:%s;"
                , "id", this.id
                , "title", this.title
                , "text", this.text
                , "date", this.date);
    }

    @Override
    public boolean setFromStringRepresents(String Represents) {

        String[] keyValueArray = Represents.split(";");
        if (keyValueArray.length != 4)
            return false;
        for (String keyValue : keyValueArray
        ) {
            String[] keyAndValue = keyValue.split(":");
            if (keyAndValue.length != 2)
                return false;
            switch (keyAndValue[0]) {
                case "id":
                    this.id = Integer.parseInt(keyAndValue[1]);
                    break;
                case "title":
                    this.title = keyAndValue[1];
                    break;
                case "text":
                    this.text = keyAndValue[1];
                    break;
                case "date":
                    this.date = keyAndValue[1];
                    break;
                default:
                    return false;
            }
        }
        return true;
    }


}
