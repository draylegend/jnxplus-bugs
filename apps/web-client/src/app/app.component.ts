import { HttpClient } from '@angular/common/http';
import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  changeDetection: ChangeDetectionStrategy.OnPush,
  selector: 'eon-root',
  templateUrl: './app.component.html',
})
export class AppComponent {
  greeting$ = this.http.get('http://localhost:8080/api/greeting');

  constructor(private readonly http: HttpClient) {}
}
