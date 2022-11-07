import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-blueprint-string',
  templateUrl: './blueprint-string.component.html',
  styleUrls: ['./blueprint-string.component.scss']
})
export class BlueprintStringComponent implements OnInit {
  @Input() field!: FormGroup;
  @Input() index!: number;

  constructor() { }

  ngOnInit(): void {
  }

}
