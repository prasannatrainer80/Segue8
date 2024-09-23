import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { MatTable1Component } from './mat-table1/mat-table1.component';

import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatCardModule} from '@angular/material/card';
import {MatSortModule} from '@angular/material/sort';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { HttpClientModule } from '@angular/common/http';
import { EmployShowComponent } from './employ-show/employ-show.component';
import { MatSortExComponent } from './mat-sort-ex/mat-sort-ex.component';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatPaginationSortExComponent } from './mat-pagination-sort-ex/mat-pagination-sort-ex.component';
import { EmployMatSortExComponent } from './employ-mat-sort-ex/employ-mat-sort-ex.component';
import { MatRepeatComponent } from './mat-repeat/mat-repeat.component';
@NgModule({
  declarations: [
    AppComponent,
    MatTable1Component,
    EmployShowComponent,
    MatSortExComponent,
    MatPaginationSortExComponent,
    EmployMatSortExComponent,
    MatRepeatComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    MatTableModule,
    MatPaginatorModule,
    // CommonModule,
    MatInputModule,
    MatSelectModule,
    MatCardModule,
    MatSortModule,
    AppRoutingModule
  ],
  providers: [
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
