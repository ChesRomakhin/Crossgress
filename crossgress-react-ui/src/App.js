import React, {Component} from 'react';
import {Label, Icon} from 'semantic-ui-react';
import './App.css';
import 'semantic-ui-css/semantic.min.css';

const timesRegExp = /x(\d+(-\d+)?)/;

class App extends Component {

  state = {
    value: ''
  };

  render() {
    let tags = [];
    if (this.state.value.endsWith(' ') && timesRegExp.test(this.state.value.substr(0, this.state.value.length - 1))) {
      let times = timesRegExp.exec(this.state.value.substr(0, this.state.value.length - 1))[1];

      tags.push((
        <Label key='1'><Icon name='redo'/>{times}</Label>
      ));
    }

    return (
      <div>
        {tags}
        <input onChange={(event) => this.setState({value: event.target.value})}/>
      </div>
    );
  }
}

export default App;
