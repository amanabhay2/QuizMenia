import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { QuizServiceService } from '../create-quiz/quiz-service.service';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from '../../app.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule, CommonModule, HttpClientModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
  providers: [QuizServiceService]
})
export class HomeComponent {
  
  constructor(private service: QuizServiceService
    ,private route :AppComponent) { }
  quizes: any;
  ngOnInit(): void {
    this.service.getAllQuiz().subscribe((response: any)=>{
      console.log(response);
      this.quizes = response; 
    });
    console.log(this.quizes);
  }

  playRoute(Id:number) {
    console.log(Id);
    this.route.navigateToPlayQuizWithId(Id);
  }

}


// .subscribe((response)=>{
//   console.log(response);
//   this.quizes=response;
// })