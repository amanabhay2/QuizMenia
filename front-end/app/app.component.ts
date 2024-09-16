import { Component , OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
 
import { CommonModule } from '@angular/common';
import { RouterModule,Router } from '@angular/router';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule,RouterModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  constructor(private router: Router) {}  

  navigateToHome(){
    this.router.navigate(['']);
  }
  navigateToPlayQuiz(){
    this.router.navigate(['/playQuiz'])
  }
  navigateToPlayQuizWithId(id:any){
    this.router.navigate(['/playQuiz',id]);
  }
  navigateToCreateQuiz(){
    this.router.navigate(['/createQuiz']);
  }
  navigateToCreateQuestion(){
    this.router.navigate(['/createQuestion']);
  }
  navigateToReadQuestion(){
    this.router.navigate(['/readQuestion']);
  }
  navigateToDeleteQuestion(){
    this.router.navigate(['/deleteQuestion']);
  }
  

  
  


}
