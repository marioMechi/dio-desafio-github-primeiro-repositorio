import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DataBinndingComponent } from './pages/data-binnding/data-binnding.component';
import { PipesExampleComponent } from './pages/pipes-example/pipes-example.component';
import { TodoListComponent } from './pages/todo/todo-list/todo-list.component';
import { UserFormComponent } from './pages/users/user-form/user-form.component';
import { UsersListComponent } from './pages/users/users-list/users-list.component';

const routes: Routes = [
  {path:'', component: UsersListComponent},
  {path:'form', component:UserFormComponent},
  {path:'form/:id', component:UserFormComponent},
  {path:'todo', component: TodoListComponent},
  {path: 'data-bindning', component:DataBinndingComponent},
  {path:'pipes', component: PipesExampleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
