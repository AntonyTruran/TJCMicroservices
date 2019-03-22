import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import * as Constants from './Constants';
import Login from './Login.js';

class PrizePage extends Component {
    constructor(props) {
        super(props);
        this.state = {
            Prize: ""
        }
            this.getPrize();
    }

    getPrize = () => {
        axios.get(Constants.DRAW_PRIZE)
            .then(r => this.setState({Prize: r.data}));   
    }
  render() {    
  if(this.state.Prize === "Unfortunately On This Occasssion You Have Not Won A Prize."){
    return(
        <div>  
        <h4>
              Unfortunately On This Occasssion <br/>You Have Not Won A Prize.
        </h4>
        </div>
      );
  }
  else{
      return (
        <div wait={5000}>
             <h4>
              !Congratulations! {this.state.Prize}
            </h4>

        </div>
    );
  }
  }
}

export default PrizePage;
