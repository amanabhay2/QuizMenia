import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { CommonModule } from '@angular/common';
import { SingleQuestionService } from '../r/singleQuestion.service';
import { HttpClientModule } from '@angular/common/http';
import { Question } from './question';
@Component({
  selector: 'app-c',
  standalone: true,
  imports: [FormsModule,HttpClientModule,CommonModule],
  templateUrl: './c.component.html',
  styleUrl: './c.component.css',
  providers: [SingleQuestionService]
})

export class CComponent {

  constructor(private service:SingleQuestionService){}
  event: any;
  createQuestion(frm: any) {
    console.log(frm);
    this.event=this.service.createQuestion(frm);
  }
  updateQuestion(frm: any){
    console.log(frm);
    this.event=this.service.updateQuestion(frm);
  }
}



    // let a={difficulty: "Easy",
    //   domain: "Java",
    //   id: 1,
    //   option1: "1995",
    //   option2: "1996",
    //   option3: "1998",
    //   option4: "1999",
    //   questiontitle: "When was java created",
    //   rightanswer: "1995"}