import { HomepageModule } from './page/homepage/homepage.module';
import { NgModule } from '@angular/core';
import { RouterModule, Routes, CanActivate } from '@angular/router';
import { AuthGuard } from './page/auth.guard';

const routes: Routes = [
  {path: '', redirectTo: 'auth', pathMatch: 'full'},
  { path: 'auth', loadChildren: () => import('./page/auth/auth.module').then(m => m.AuthModule) },
  {
    path: 'homepage',
    canActivate: [AuthGuard],
    loadChildren: () => import('./page/homepage/homepage.module').then(m => m.HomepageModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
