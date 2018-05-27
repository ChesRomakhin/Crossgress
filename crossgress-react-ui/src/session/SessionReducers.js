import {REMOVE, RESULT, ADD} from "./SessionActions";

const initialState = {
    sessions: {}
};

export function sessions(state = initialState, action) {
    switch (action.type) {
        case ADD:
            let sessions = state.sessions;
            sessions[action.session.id] = Object.assign({}, action.session);

            return Object.assign({}, state, {
                sessions
            });
            break;
        case REMOVE:
            let sessions = state.sessions;
            delete sessions[action.id];

            return Object.assign({}, state, {
                sessions
            });
            break;
        case RESULT:
        default:
            return state;
            break;
    }
}