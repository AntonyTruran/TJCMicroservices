import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import AccountCreated from './AccountCreated.js';
import Login from './Login.js';
import PrizePage from './PrizePage.js';
const Main = () => (
    <main>
        <Router>
            <Switch>
                <Route exact path='/' component={Login} />
                <Route path='/accountCreated' component={AccountCreated} />
                <Route path='/prizePage' component={PrizePage}/>
            </Switch>
        </Router>
    </main>
)
export default Main;