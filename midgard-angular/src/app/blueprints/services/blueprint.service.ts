import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BlueprintService {
  constructor(private httpClient: HttpClient) { }

  getBlueprints() {
    return this.httpClient.get('/api/v1/blueprints')
      .pipe();
  }

  getBlueprintById(id: number) {}

  postBlueprint(data: any) {
    return this.httpClient.post('/api/v1/blueprints', data);
  }
}
