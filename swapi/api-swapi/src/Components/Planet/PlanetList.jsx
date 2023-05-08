import React, { useEffect, useState } from "react";

import PlanetItem from "./PlanetItem";

const PlanetList = () => {
    const [planets, setPlanets] = useState([]);

    /*const listPlanets = async () => {
        try {
            const res = await PlanetServer.listPlanets();
            const data = await res.json();
            console.log(data);
            setPlanets(data.planets);
        } catch (error) {
            console.log(error);
        }
    };*/

    useEffect(()=> {
          async function fetchPlanets(){
            let res = await fetch('https://swapi.dev/api/planets/?format=json');
            let data = await res.json();
            setPlanets(data.results);
        
          }
    
          fetchPlanets();
    
      }, [])

    return (
        <div>
            {planets.map((planets) => (
                <PlanetItem data={planets.id}/>
                
            ))}
        </div>
    );
};

export default PlanetList;
