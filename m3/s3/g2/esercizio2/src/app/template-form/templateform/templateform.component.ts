import { NgForm } from '@angular/forms';
import { Superhero } from './../../superhero';
import { Component, ViewChild } from '@angular/core';

@Component({
  selector: 'app-templateform',
  templateUrl: './templateform.component.html',
  styleUrls: ['./templateform.component.scss']
})
export class TemplateformComponent {

  //@ViewChild('f', {static:true}) form!:NgForm;

  Superhero:any = {};

  submitForm(form:NgForm) {
    if (form.valid) {
      console.log('Dati del supereroe:', this.Superhero);
      form.resetForm();
    } else {
      alert('Compila correttamente tutti i campi obbligatori.');
    }
  }

}
