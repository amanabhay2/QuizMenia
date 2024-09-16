import { Routes } from '@angular/router';
import {HomeComponent} from './quizing/home/home.component'
import { PlayQuizComponent } from './quizing/play-quiz/play-quiz.component';
import {CreateQuizComponent} from'./quizing/create-quiz/create-quiz.component'
import {CComponent} from './crud/c/c.component'
import {RComponent} from './crud/r/r.component'
import {DComponent} from './crud/d/d.component'

export const routes: Routes = [
    {
        path:'',
        component:HomeComponent
    },
    {
        path:'playQuiz',
        component:PlayQuizComponent
    },
    {
        path:'playQuiz/:id',
        component:PlayQuizComponent
    },
    {
        path:'createQuiz',
        component:CreateQuizComponent
    },
    {
        path:'createQuestion',
        component:CComponent
    },
    {
        path:'readQuestion',
        component:RComponent
    },
    {
        path:'deleteQuestion',
        component:DComponent
    }

];
