import React from 'react';
import 'semantic-ui-css/semantic.min.css';

import {Button, Dropdown, Input} from 'semantic-ui-react'

const options = [
  {key: 'times', text: 'Times', value: 'x', icon: 'redo', color: 'teal'},
  {key: 'time', text: 'Time', value: 't', icon: 'clock', color: 'red'},
  {key: 'cal', text: 'Calories', value: 'cal', icon: 'heartbeat', color: 'green'},
];

class TimesInput extends React.Component {

  state = {
    activeIcon: 'redo',
    activeColor: 'teal'
  };

  onItemClick = (event, data) => {
    this.setState({
      activeIcon: data.icon,
      activeColor: data.color
    });
  };

  render() {
    return <Input type='text' action>
      <input/>
      <Button.Group color={this.state.activeColor}>
        <Dropdown text='' icon={this.state.activeIcon} floating button className='icon'>
          <Dropdown.Menu>
            {this.props.options.map(option => (
              <Dropdown.Item {...option} onClick={this.onItemClick}/>
            ))}
          </Dropdown.Menu>
        </Dropdown>
      </Button.Group>
    </Input>
  }

}

TimesInput.defaultProps = {
  options
};

export default TimesInput;