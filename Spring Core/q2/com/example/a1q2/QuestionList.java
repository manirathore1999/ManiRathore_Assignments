package com.example.a1q2;

import java.util.List;

public class QuestionList {
	  private int questionId;
	  private String question;
	  private List<String> answers;
	  
	  public QuestionList() {
			super();
			// TODO Auto-generated constructor stub
		}
	  
	  public int getQuestionId()
	  {
	  	return questionId;
	  }
	  public void setQuestionId(int questionId)
	  {
	  	this.questionId = questionId;
	  }
	  public String getQuestion() 
	  {
	  	return question;
	  }
	  public void setQuestion(String question)
	  {
	  	this.question = question;
	  }
	  public List<String> getAnswers() 
	  {
	  	return answers;
	  }
	  public void setAnswers(List<String> answers) 
	  {
	  	this.answers = answers;
	  }
	  public QuestionList(int questionId, String question, List<String> answers) 
	  {
	  	super();
	  	this.questionId = questionId;
	  	this.question = question;
	  	this.answers = answers;
	  }

	  @Override
	  public String toString() 
	  {
	  	return "QuestionList [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	  } 
	  
	  

}
