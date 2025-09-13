# post-service

The `post-service` is a service for storing, retrieving, and searching tech posts. The `post-service` provides the following features:
* Storing tech posts
* Retrieving a tech post by identifier
* Semantic search for tech posts

## POST Structure

| Field Name    | Data Type       | Required | Description                            |
|:--------------|:----------------|:---------|:---------------------------------------|
| **`postId`**  | Long            | Required | Unique identifier for the post         |
| **`company`** | String          | Required | Company that published the post        |
| **`url`**     | String          | Required | URL of the original post               |
| **`summary`** | String          | Optional | A summary of the post's content        |
| **`tags`**    | List of Strings | Optional | A list of relevant tags (can be empty) |

## API Specifications

### Create Post
```http request
POST /api/v1/posts HTTP/2
Content-Type: application/json

{
  "company": "string",
  "url": "string",
  "summary": "string",
  "tags": ["string"]
}
```

### Get Post
```http request
GET /api/v1/posts/{postId} HTTP/2
```

### Search Post
```http request
GET /api/v1/posts/search?query={query}&limit={limit}&offset={offset} HTTP/2
```
