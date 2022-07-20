import { Component,OnInit,ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  public primaryXAxis: Object | undefined;
public chartData: Object[] | undefined;
public primaryYAxis: Object | undefined;
public legendSettings: Object | undefined;
public tooltip: Object | undefined;
public title: string | undefined;
public marker: Object | undefined;
ngOnInit(): void {
    // Tooltip for chart
    this.tooltip = {
        enable: true
    }
    this.chartData = [
        { month: 'Jan', sales: 35 }, { month: 'Feb', sales: 28 },
        { month: 'Mar', sales: 34 }, { month: 'Apr', sales: 32 },
        { month: 'May', sales: 40 }, { month: 'Jun', sales: 32 },
        { month: 'Jul', sales: 35 }, { month: 'Aug', sales: 55 },
        { month: 'Sep', sales: 38 }, { month: 'Oct', sales: 30 },
        { month: 'Nov', sales: 25 }, { month: 'Dec', sales: 32 }
    ];
    this.primaryXAxis = {
        valueType: 'Category'
    };
    this.primaryYAxis = {
        labelFormat: '${value}K'
    };
    this.marker = {
        dataLabel:{
            visible: true
        }
    };
    this.legendSettings = {
        visible: true
    };
    this.title = 'Sales Analysis';
}
  ttitle = 'BenchMarx';
  showFiller = false;
  showTitle=true;
  button1=true;
  button2=false;
  Onclick(){
    if(this.showTitle==true){
      this.showTitle=false;
      this.button1=false;
      this.button2=true;
    }
    else{
      this.showTitle=true;
      this.button1=true;
      this.button2=false;
    }
    
   
  }
}
