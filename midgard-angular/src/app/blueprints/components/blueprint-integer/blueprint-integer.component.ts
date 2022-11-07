import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-blueprint-integer',
  templateUrl: './blueprint-integer.component.html',
  styleUrls: ['./blueprint-integer.component.scss']
})
export class BlueprintIntegerComponent implements OnInit {
  @Input() field!: FormGroup;
  @Input() index!: number;

  constructor() { }

  ngOnInit(): void {
  }

}
