import React, { useEffect, useState } from "react";

import * as  PlanetServer from './PlanetServer';

const PlanetList = () => {
    const [planets, setPlanets] = useState([]);

    const listPlanets = async () => {
        try {
            const res = await PlanetServer.listPlanets();
            const data = await res.json();
            console.log(data);
            setPlanets(data.planets);
        } catch (error) {
            console.log(error);
        }
    };

    useEffect(() => {
        listPlanets();
    }, []);

    return (
        <div>
            {planets.map((planets) => (
                <h2>{planets.count}</h2>
            ))}
        </div>
    );
};

export default PlanetList;
