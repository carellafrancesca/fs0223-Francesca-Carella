import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrls: ['./reactiveform.component.scss']
})
export class ReactiveFormComponent{
  form!: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.form = this.formBuilder.group({
      name: ['', Validators.required],
      alterEgo: ['', Validators.required],
      power: ['', Validators.required],
      enemy: [''],
      planet: ['', [Validators.required, Validators.minLength(5)]],
      weakness: ['']
    });
  }

  submitForm() {
    if (this.form.valid) {
      console.log(this.form.value);
    }
  }
}
