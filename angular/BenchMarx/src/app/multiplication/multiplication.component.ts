import { Component, OnInit } from '@angular/core';
import { Chart, registerables } from 'chart.js'

@Component({
  selector: 'app-multiplication',
  templateUrl: './multiplication.component.html',
  styleUrls: ['./multiplication.component.scss']
})
export class MultiplicationComponent implements OnInit {

  chart1: any;
  chart2: any;
  constructor() { }

  ngOnInit(): void {
    this.chart1 = document.getElementById('myChart');
    this.chart2 = document.getElementById('myChart2');
    Chart.register(...registerables);
    this.loadChart();
  }
  loadChart(): void {
    new Chart(this.chart1, {
      
      type: 'bar',
      data: {
        labels: ['Java', 'Python', 'Go'],
        datasets: [{
          label: 'Time',
          data: [777377, 3680467, 522810],
          backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',

          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: false,
        scales: {
          y: {
            beginAtZero: true,
            title: { display: true, text: 'Time',font:{size: 15} }
          },
          x: { title: { display: true, text: 'Languages',font:{size: 15} }}
          
        },
        plugins: {
          title: {
              display: true,
              text: 'Subtraction Average Time Graph'
          }
      }
      }
    })

    new Chart(this.chart2, {
      type: 'bar',
      data: {
        labels: ['Java', 'Python', 'Go'],
        datasets: [{
          label: 'Memorey',
          data: [777377, 3680467, 522810],
          backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',

          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: false,
        scales: {
          y: {
            beginAtZero: true,
            title: { display: true, text: 'Memory' ,font:{size: 15}}
          },
          x: { title: { display: true, text: 'Languages',font:{size: 15} }}
        },
        plugins: {
          title: {
              display: true,
              text: 'Subtraction Memorey Usage Graph'
          }
      }
        

      }
    })


  }

}
