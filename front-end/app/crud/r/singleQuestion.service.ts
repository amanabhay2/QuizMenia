import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Question } from '../c/question';
@Injectable({
  providedIn: 'root',

})
export class SingleQuestionService {


  constructor(private http: HttpClient) { }


  urlGet = "http://localhost:8080/quiz/getQuestion/";
  urlGetAll = "http://localhost:8080/quiz/getAllQuestion";
  urlCreate = "http://localhost:8080/quiz/addQuestion";
  urlUpdate = "http://localhost:8080/quiz/updateQuestion";
  urlDelete = "http://localhost:8080/quiz/deleteQuestion/";
  getQuestion(Id:number) {
    console.log("questioncalling");
    return this.http.get(`${this.urlGet+Id}`);
  }
  getAllQuestion(){
    console.log("All question calling");
    return this.http.get(`${this.urlGetAll}`);
  }
  createQuestion(question:any){
    console.log("create Question calling"+JSON.stringify(question));
    let status=this.http.post(`${this.urlCreate}`,question);
    console.log(status);
    status.subscribe((sta)=>{
      console.log(sta);
    });
  }
  updateQuestion(question: any){
    console.log("Calling update Question"+question);
    let status=this.http.put(`${this.urlUpdate}`,question);
    console.log(status);
    status.subscribe((sta)=>{
      console.log(sta);
    });
  }
  delete(Id:any){
    console.log("calling delete qustion");
    let status=this.http.delete(`${this.urlDelete+Id}`);
    console.log(status);
    status.subscribe((sta)=>{
      console.log(sta);
    });
  }

}
