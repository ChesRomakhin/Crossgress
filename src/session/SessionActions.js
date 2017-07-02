/* Action types */
export const TYPE = "SESSION";

export const ADD = "ADD_" + TYPE;
export const RESULT = "RESULT_" + TYPE;
export const REMOVE = "REMOVE_" + TYPE;


/* Action generators */
export function addSession(session) {
    return {
        type: ADD,
        session
    }
}

export function removeSession(id) {
    return {
        type: REMOVE,
        id
    }
}

export function resultSession(id, date, results) {
    return {
        type: RESULT,
        id,
        date,
        results
    }
}