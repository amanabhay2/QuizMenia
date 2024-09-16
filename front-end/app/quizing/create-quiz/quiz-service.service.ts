import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QuizServiceService {

  constructor(private http:HttpClient) { }

  urlGetQuiz = "http://localhost:8080/quizPlay/get/";
  urlCreateQuiz = "http://localhost:8080/quizPlay/create";
  urlGetAllQuiz = "http://localhost:8080/quizPlay/getAll";
  getQuiz(Id:number){
    return this.http.get(`${this.urlGetQuiz+Id}`);
  }
  getAllQuiz():any{
    return this.http.get(`${this.urlGetAllQuiz}`);
  }
  createNewQuiz(input:any){
    return this.http.post(`${this.urlCreateQuiz}`,input);
  }
  

}
