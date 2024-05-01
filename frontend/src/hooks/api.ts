import axios from "axios";
import auth from "../config/auth";

export const api = axios.create({
  baseURL: auth.baseUrl,
});

export const useApi = () => ({
    signin: async (email: string, password: string) => {
        const response = await api.post("/api/register", { email, password });
        return response.data;
    },
    register: async (name: string, email: string, password: string) => {
        const response = await api.post("/api/register", { name, email, password });
        return response.data;
    },
    signout: async () => {
        const response = await api.post("/signout");
        return response.data;
    },
});