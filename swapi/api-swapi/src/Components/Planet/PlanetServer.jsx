export const listPlanets = async () => {
    return await fetch('https://swapi.dev/api/planets/?format=json');
};