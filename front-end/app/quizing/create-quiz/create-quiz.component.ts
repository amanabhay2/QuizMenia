import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {NgForm} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { QuizServiceService } from './quiz-service.service';

@Component({
  selector: 'app-create-quiz',
  standalone: true,
  imports: [FormsModule, HttpClientModule],
  templateUrl: './create-quiz.component.html',
  styleUrl: './create-quiz.component.css',
  providers: [QuizServiceService]
})
export class CreateQuizComponent {

  constructor(private service:QuizServiceService){}

  createQuiz(frm:NgForm)
  {
    console.log(frm);
    let r:any;
    this.service.createNewQuiz(frm).subscribe((response)=>{
      console.log(response);
      r=response;
      
    });
  }
}
