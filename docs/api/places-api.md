# Places API Documentation

## Base URL

`TBD`

## Endpoints

### GET /places/nearby

Fetch nearby places of interest.

**Query Parameters:**
- `lat` (required): Latitude
- `lng` (required): Longitude
- `radius` (optional): Search radius in meters
- `type` (optional): Place type filter

**Response:** `200 OK`

```json
{
  "places": [
    {
      "id": "string",
      "name": "string",
      "type": "string",
      "latitude": 0.0,
      "longitude": 0.0,
      "address": "string",
      "rating": 0.0,
      "imageUrl": "string"
    }
  ]
}
```

### GET /places/{id}

Fetch details for a specific place.

### GET /places/search

Search places by query string.
