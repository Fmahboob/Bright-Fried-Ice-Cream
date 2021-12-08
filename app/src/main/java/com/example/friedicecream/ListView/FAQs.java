package com.example.friedicecream.ListView;

public class FAQs {
    private int image;
    private int question;
    private int answer;


    public FAQs(int image, int question, int answer) {
        this.image = image;
        this.question = question;
        this.answer = answer;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
