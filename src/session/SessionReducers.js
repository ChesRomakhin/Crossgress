import {REMOVE, RESULT, ADD} from "./SessionActions";

const initialState = {
    sessions: {}
};

export function sessions(state = initialState, action) {
    switch (action.type) {
        case ADD:
            return Object.assign({}, state, {
                sessions: [
                    ...state.sessions,
                    Object.assign({}, action.session)
                ]
            });
            break;
        case REMOVE:
        default:
            return state;
            break;
    }
}