import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { SingleQuestionService } from '../r/singleQuestion.service';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-d',
  standalone: true,
  imports: [FormsModule,HttpClientModule],
  templateUrl: './d.component.html',
  styleUrl: './d.component.css',
  providers:[SingleQuestionService]
})
export class DComponent {

  constructor(private service:SingleQuestionService){}

  deleteQuestion(frm:any)
  {
    console.log(frm.id);
    this.service.delete(frm.id);
  }
}
