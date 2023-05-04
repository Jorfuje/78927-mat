const API_URL = "https://swapi.dev/api/planets";

export const listPlanets = async () => {
    return await fetch(API_URL);
};