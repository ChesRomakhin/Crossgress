import React from 'react';
import {storiesOf} from '@storybook/react';
import {action} from '@storybook/addon-actions';
import TimesInput from "../src/TimesInput";

storiesOf('TimesInput', module)
  .add('simple', () => (<TimesInput/>));