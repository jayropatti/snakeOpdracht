export default class SnakeService {
    async getSnake() {
        return fetch("/restservices/snake").then(response => response.json())
        //
        // return Promise.resolve({
        //     apiversion: "1",
        //     author: "Jayro Pattimaipau",
        //     color: "#0000FF",
        //     head: "replit-mark",
        //     tail: "rbc-necktie",
        //     version: "0.1"
        // });
        // dit was overbodig
    }

    async updateSnake(updatedSnake) {
        //TODO: update je slang aan de server-kant met de nieuwe gegevens
        let fetchOptions = {
            method: "PUT",
            body: JSON.stringify(updatedSnake),
            headers: {"Content-type": "application/json"}
        }
        return fetch("/restservices/snake/snakeUpdate", fetchOptions).then(response => response.status)
    }
}
