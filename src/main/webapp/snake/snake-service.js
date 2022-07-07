export default class SnakeService {
    async getSnake() {
        //haal data v de server
        return fetch("/restservices/snake").then(response => response.json())
    }

    async updateSnake(updatedSnake) {
        //TODO: update je slang aan de server-kant met de nieuwe gegevens
        // -Put request: snakeUpdate met json body v updatesSnake als string
        let fetchOptions = {
            method: "PUT",
            body: JSON.stringify(updatedSnake),
            headers: {"Content-type": "application/json"}
        }
        return fetch("/restservices/snake/snakeUpdate", fetchOptions).then(response => response.status)
    }
}
