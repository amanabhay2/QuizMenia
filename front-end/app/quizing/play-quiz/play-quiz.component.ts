import { Component ,OnInit} from '@angular/core';
import {FormsModule} from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { QuizServiceService } from '../create-quiz/quiz-service.service';
import { HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-play-quiz',
  standalone: true,
  imports: [FormsModule,CommonModule,HttpClientModule],
  templateUrl: './play-quiz.component.html',
  styleUrl: './play-quiz.component.css',
  providers:[QuizServiceService]
})
export class PlayQuizComponent {

  id:any;
  show=true;
  data:any;
  score=0;
  toogleShow(){
    this.show=!this.show;
    this.service.getQuiz(this.id).subscribe((response)=>{
      console.log(response);
      this.data=response;
    });
  }
  submitAnswer(ID:any,selected:any) {
    console.log(ID,selected);
  }
  ngOnInit():void{
    this.id=this.route.snapshot.paramMap.get('id');
    console.log("Id is received as",this.id);
  }
  constructor(private route: ActivatedRoute, private service:QuizServiceService){}
  getData(myform:any){
    this.show=true;
    this.id=myform.quizId;
    console.log("Form Id is",this.id);
  }
}
