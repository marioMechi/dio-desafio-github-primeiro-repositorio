import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { starModule } from "../shared/component/star/star.module";
import { appPipeModule } from "../shared/pipe/app-pipe-module";
import { CourseInfoComponent } from "./course-info.component";
import { CourseListComponent } from "./course-list.component";

@NgModule({
    declarations:[
    CourseListComponent,
    CourseInfoComponent,
    ],
    imports:[
      CommonModule,
      FormsModule,
      starModule,
      appPipeModule,
      RouterModule.forChild{[
            {
                path:'courses', component: CourseListComponent
            },
            {
                path: 'courses/info:Id', component: CourseInfoComponent
            }
    ]}
    ]
})
export class CourseModule{

}