import { Component, OnInit } from '@angular/core';
import {MatTreeFlatDataSource, MatTreeFlattener} from '@angular/material/tree';
import {FlatTreeControl} from '@angular/cdk/tree';
import { Router } from '@angular/router';

interface FoodNode {
  name: string;
  children?: FoodNode[];
}

const TREE_DATA: FoodNode[] = [
  {
    name: 'Arithmatic Operation',
    children: [{name: 'Addition'}, {name: 'Subtraction'}, {name: 'Multiplication'},{name: 'Division'}],
  },
  {
    name: 'Array',
    children: [{name: 'One-Dimentional'}, {name: 'Multi-Dimentional'}],
  },

  {
    name: 'String',
    children: [{name: 'Split-String'}, {name: 'Trim-String'}],
  },
  {
    name: 'BitWise Operators',
    children: [{name: 'AND'}, {name: 'OR'},{name: 'XOR'}, {name: 'Left-Shift'},{name: 'Right-Shift'}],
  },
  {
    name: 'Logical Operators',
    children: [{name: 'Logical "AND"'}, {name: 'Logical "OR"'},{name: 'Logical "NOT"'}],
  },
  {
    name: 'Relational Operators',
    children: [{name: 'Equalto "="'}, {name: 'Geater than ">"'},{name: 'Less than "<"'},{name:'Not Equal "!="'},{name:'Greater Equal ">="'}],
  },
  {
    name: 'Loops',
    children: [
      {
        name: 'For'
      },
      {
        name: 'While'
      },
      {
        name: 'Do-While'
      },
    ],
  },
  {
    name: 'Conditional',
    children: [
      {
        name: 'If-Else'
      },
      {
        name: 'Nested If-Else'
      },
      {
        name: 'Switch'
      },
    ],
  },
  {
    name: 'OOPS',
    children: [
      {
        name: 'Abstraction'
      },
      {
        name: 'Encapsulation'
      },
      {
        name: 'Inheritance'
      },
      {
        name: 'Polymorphism'
      },
    ],
  },

  {
    name: 'File Handling',
    children: [
      {
        name: 'Read File'
      },
      {
        name: 'Write File'
      }
    ],
  },

  {
    name: 'Thread',
  },
  
];

/** Flat node with expandable and level information */
interface ExampleFlatNode {
  expandable: boolean;
  name: string;
  level: number;
}
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent  {

  constructor(private router: Router) { 
    this.dataSource.data = TREE_DATA;
  }
  private _transformer = (node: FoodNode, level: number) => {
    return {
      expandable: !!node.children && node.children.length > 0,
      name: node.name,
      level: level,
    };
  };

  treeControl = new FlatTreeControl<ExampleFlatNode>(
    node => node.level,
    node => node.expandable,
  );

  treeFlattener = new MatTreeFlattener(
    this._transformer,
    node => node.level,
    node => node.expandable,
    node => node.children,
  );

  dataSource = new MatTreeFlatDataSource(this.treeControl, this.treeFlattener);

  
  onPress(name: String){
    
    switch(name) { 
      case "Addition": { 
        this.router.navigate(["/Addition"]).then(() => {
          window.location.reload(); });
         break; 
      } 
      case "Subtraction": { 
        this.router.navigate(["/Subtraction"]).then(() => {
          window.location.reload(); });;
         break; 
      } 
      case "Multiplication": { 
        this.router.navigate(["/Multiplication"]).then(() => {
          window.location.reload(); });;
         break; 
      } 
      case "Division": {
        this.router.navigate(["/Division"]).then(() => {
          window.location.reload(); });;
        break;
      }
      case "One-Dimentional": { 
        this.router.navigate(["/OneD"]).then(() => {
          window.location.reload(); });;
         break; 
      } 
      case "Multi-Dimentional": {
        this.router.navigate(["/MultiD"]).then(() => {
          window.location.reload(); });;
        break;
      }
      default: { 
        alert("hey");
         break; 
      } 
   } 
    
  }
 
  hasChild = (_: number, node: ExampleFlatNode) => node.expandable;
}

  

