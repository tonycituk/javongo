
# Javongo ☕🍃
<a href="https://gitmoji.dev">
  <img src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square" alt="Gitmoji">
</a>

Springboot CRUD api using containerized mongoDB. Feel free to use it as an example for your projects. 

## Running
> Make sure ports 27017 & 8080 are available.

#### mongoDB
> javongo/
```bash
mkdir -p mongodb/db
docker-compose up -d
```
#### Springboot 
> javongo/javongo/
```bash
./gradlew bootRun
```

## API Reference

> Server should be running on localhost:8080.
#### Get all javongos

```http
  GET /javongos
```

#### Get javongo

```http
  GET /javongo/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of javongo to fetch |

#### Add javongo

```http
  POST /javongo
```
> Request body

```json
{
  "message": "<your-javongo-message>"
}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `message`      | `string` | **Required**. Message of new javongo |

#### Update javongo

```http
  PUT /javongo/${id}
```
> Request body

```json
{
  "message": "<your-javongo-message>"
}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of javongo to update |
| `message`      | `string` | **Required**. Message of updated javongo |

#### Remove javongo

```http
  DELETE /javongo/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of javongo to remove |

## Stopping
> javongo/
```bash
docker-compose down -v
```
You can kill the springboot process, pressing <kbd>Ctrl</kbd> + <kbd>c</kbd> in the terminal where the procces is running.

Made with 💗 and </>.
