import { Component , OnInit, importProvidersFrom } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { SingleQuestionService } from "./singleQuestion.service";
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-r',
  standalone: true,
  imports: [FormsModule,CommonModule,HttpClientModule] ,
  templateUrl: './r.component.html',
  styleUrl: './r.component.css',
  providers: [SingleQuestionService]
  
})
export class RComponent {

  OnInit():void{}

  constructor(public serv:SingleQuestionService){}
  data: any;
  show: any;
  switchVisibility()
  {
    this.show=!this.show;
  }

  getData(frm:any)
  {
    this.show=false;
    let Id=frm.id;
    console.log(Id);  
    this.serv.getQuestion(Id).subscribe((quesData)=>
    {
      console.log(quesData);
      this.data=[quesData];
    });
    //Boolean array for show answer button
    
  }
  getAllQuestions()
  {
    this.show=false;
    console.log("printing all questions");
    this.serv.getAllQuestion().subscribe((quesData)=>
    {
      console.log(quesData);
      this.data=quesData
    });

  }
}
