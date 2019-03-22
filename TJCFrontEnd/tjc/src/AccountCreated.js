import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import * as Constants from './Constants';
import Login from './Login.js';

class AccountCreated extends Component {
    constructor(props) {
        super(props);
        this.state = {
            Name: this.getName(),
            Number: this.getAccountNumber(),
        }
    }

    getName = () => {
        axios.get(Constants.FIRST_NAME)
            .then(r => this.setState({ Name: r.data }));

    }
    getAccountNumber = () => {
        axios.get(Constants.ACCOUNT_NUMBER)
            .then(r => this.setState({ Number: r.data }));
    }
  render() {
    return (
        <div wait={5000}>

            <div>
                <p>{'Hello '}
                    {this.state && this.state.Name && this.state.Name}
                </p>
            </div>
            <pre> Your Account Number Is: {this.state.Number}</pre>
            <pre>Enter your Account Number<br/> here to see if you have won<br/> a Prize!</pre>
            <input type="text" onChange={this.onChange} placeholder="Enter Account Number"/>
      </div>
    );
  }
}

export default AccountCreated;
