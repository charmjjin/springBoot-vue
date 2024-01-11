import axios from 'axios';

function apiInstance() {
    console.log(import.meta.env.VITE_API_BASE_URL)
  const instance = axios.create({
   // baseURL: "http://localhost:8080",
    headers: {
        "Content-Type":"application/json"
    }
  });
  return instance;
}

export { apiInstance };