package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;

import com.google.gson.Gson;

import java.io.Serializable;

public class seleccionAgentes extends AppCompatActivity {

    ImageButton astra, breach, brimstone, chamber, cypher, jett, kayo, killjoy, neon, omen, phoenix, raze, reyna, sage, sky, sova, viper, yoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_agentes);
        //definir Botones
        astra = (ImageButton) this.findViewById(R.id.btnAstra);
        breach = (ImageButton) this.findViewById(R.id.btnBreach);
        brimstone = (ImageButton) this.findViewById(R.id.btnBrimstone);
        chamber = (ImageButton) this.findViewById(R.id.btnChamber);
        cypher = (ImageButton) this.findViewById(R.id.btnCyper);
        jett = (ImageButton) this.findViewById(R.id.btnJett);
        kayo = (ImageButton) this.findViewById(R.id.btnKayo);
        killjoy = (ImageButton) this.findViewById(R.id.btnKilljoy);
        neon = (ImageButton) this.findViewById(R.id.btnNeon);
        omen = (ImageButton) this.findViewById(R.id.btnOmen);
        phoenix = (ImageButton) this.findViewById(R.id.btnPhoenix);
        raze = (ImageButton) this.findViewById(R.id.btnRaze);
        reyna = (ImageButton) this.findViewById(R.id.btnReyna);
        sage = (ImageButton) this.findViewById(R.id.btnSage);
        sky = (ImageButton) this.findViewById(R.id.btnSky);
        sova = (ImageButton) this.findViewById(R.id.btnSova);
        viper = (ImageButton) this.findViewById(R.id.btnViper);
        yoru = (ImageButton) this.findViewById(R.id.btnYoru);





       //Definir Clases de cada Agente
        Agente jettAgent = new Agente("Jett", "duelista", "Corea del Sur", "jettf",
                "jett", "hjett1", "hjett2", "hjett3",
                "hjett4", "Propulsa a Jett hacia el aire AL INSTANTE.", "Propulsa AL INSTANTE a Jett hacia la dirección a la que se dirige. Si no se está moviendo, se propulsará hacia adelante.","Lanza un proyectil AL INSTANTE que se convierte en una nube que bloquea la visión al impactar alguna superficie. MANTÉN PRESIONADA la tecla de la habilidad para cambiar la trayectoria del humo hacia donde apuntes.",
                "EQUIPA un conjunto de cuchillos de gran precisión que se recargan al asesinar a un oponente. DISPARA para lanzar un cuchillo hacia tu objetivo y usa el DISPARO SECUNDARIO para lanzar todos los cuchillos restantes.", "Es imparable en todos los enfrentamientos y acaba con sus enemigos antes de que sepan qué los atacó.", "xU2U73Tk-DM","operator","mjett");

        Agente razeAgent = new Agente("Raze", "duelista", "Brasil", "razef",
                "raze", "hraze1", "hraze2", "hraze3",
                "hraze4", "Lanza AL INSTANTE un Paquete Explosivo que se adhiere a las superficies. VUELVE A USAR la habilidad después de desplegar el paquete para detonarlo, lo que dañará y desplazará todo a su alcance. ", "EQUIPA una granada de racimo y DISPARA para lanzarla. La granada infligirá daño por su cuenta y creará submuniciones que también infligirán daño a cualquiera que se encuentre dentro de su alcance.","EQUIPA un Bumbot y DISPARA para desplegarlo. El bot se moverá en línea recta por el suelo y rebotará en los muros. El Bumbot marcará a cualquier enemigo que se encuentre en un cono frente a él y lo perseguirá. Si lo alcanza, explotará e infligirá daño masivo.",
                "EQUIPA un lanzamisiles. DISPARA para lanzar un misil que inflige daño de área masivo al entrar en contacto con algo.", "Gracias a su contundente estilo de juego, es muy buena para separar los enemigos atrincherados y para despejar espacios estrechos con una gran cantidad de explosiones.", "_gzztoO3YmE","judge","mraze");

        Agente breachAgent = new Agente("Breach", "iniciador", "Suecia", "breachf",
                "breach", "hbreach1", "hbreach2", "hbreach3",
                "hbreach4", "EQUIPA una carga cegadora y DISPARA para lanzar una ráfaga de acción rápida a través de una pared. La carga detonará y cegará a todos los jugadores que la vean.", "EQUIPA un rayo sísmico y MANTÉN PRESIONADO EL BOTÓN DE DISPARO para aumentar la distancia. SUÉLTALO para iniciar el temblor y aturdir a todos los jugadores que estén en la zona.","EQUIPA una carga de fusión y DISPARA para lanzar una ráfaga de acción lenta a través de una pared. La ráfaga infligirá daño masivo a todos los que estén en su alcance",
                "EQUIPA una carga sísmica y DISPARA para enviar un temblor en cascada por una gran zona cónica. El temblor aturde y lanza por el aire a todos los que impacta.", "El daño y la interrupción que inflige garantizarán que ninguna pelea sea justa.", "Rux0HjzKQbw","bulldog","mbreach");

        Agente omenAgent = new Agente("Omen", "controlador", "Memoria", "omenf",
                "omen", "homen1", "homen2", "homen3",
                "homen4", "Lanza un proyectil de sombras que reduce el alcance de visión de todos los jugadores a los que alcanza durante un breve periodo. Este proyectil puede atravesar paredes.", "EQUIPA un orbe de sombras y mira su indicador de alcance. DISPARA para lanzarlo hacia la ubicación marcada. El orbe creará una esfera de sombras de larga duración que bloquea la visión. MANTÉN PRESIONADO EL BOTÓN DE DISPARO SECUNDARIO mientras apuntas para alejar el marcador. MANTÉN PRESIONADA la tecla de la habilidad mientras apuntas para acercar el marcador.","EQUIPA la habilidad Paso Sombrío y mira su indicador de alcance. DISPARA para comenzar una breve canalización y luego teletranspórtate hacia la ubicación marcada.",
                "EQUIPA un mapa estratégico. DISPARA para empezar a teletransportarte hacia la ubicación seleccionada. Mientras te teletransportas, Omen lucirá como una sombra que los enemigos podrán destruir para cancelar su teletransportación.", "Un espectro de la memoria, Omen caza entre las sombras, ciega a los enemigos, se transporta a través del campo de batalla y deja que la paranoia los invada mientras intentan descubrir dónde atacará.", "jJdWy6bDj4","ares","momen");

        Agente brimstoneAgent = new Agente("Brimstone", "controlador", "Estados Unidos", "brimstonef",
                "brimstone", "hbrimstone1", "hbrimstone2", "hbrimstone3",
                "hbrimstone4", "EQUIPA un lanzagranadas incendiario y DISPARA para lanzar una granada que explota cuando se detiene en el suelo. Esta crea una zona de fuego que permanece en el campo y daña a los enemigos que estén dentro de ella.", "EQUIPA un mapa estratégico y DISPARA para marcar las ubicaciones en las que caerán las nubes de humo de Brimstone. Usa el DISPARO SECUNDARIO para confirmar y lanzar nubes de humo de larga duración que bloquearán la visión en la zona seleccionada.","EQUIPA una baliza potenciadora y DISPARA para lanzarla frente a Brimstone. Al caer, Resguardo Potenciador creará un campo que aumenta la velocidad de disparo de los jugadores.",
                "EQUIPA un mapa estratégico y DISPARA para lanzar un ataque orbital prolongado de un láser en la ubicación seleccionada. Este infligirá daño masivo con el tiempo a los jugadores que estén en la zona.", " Su habilidad otorga información de forma precisa y a distancia, lo que lo hace un comandante sin igual en el campo.", "7yHnJ_oNxTI","bucky","mbrimstone");

        Agente phoenixAgent = new Agente("Phoenix", "duelista", "Reino Unido", "phoenixf",
                "phoenix", "hphoenix1", "hphoenix2", "hphoenix3",
                "hphoenix4", "EQUIPA un orbe cegador que recorre una trayectoria curva y detona poco después de lanzarlo. DISPARA para cambiar la trayectoria del orbe cegador hacia la izquierda. Este detonará y cegará a cualquier jugador que lo vea. Usa el DISPARO SECUNDARIO para cambiar su trayectoria hacia la derecha.", "EQUIPA una bola de fuego y DISPARA para lanzarla. Esta explotará tras cierto tiempo o al impactar el suelo, lo que creará una zona de fuego que permanecerá en el campo y dañará a los enemigos.","EQUIPA un muro de fuego y DISPARA para crear una hilera de llamas que avanza, lo que creará un muro que bloquea la visión y dañará a los jugadores que lo atraviesen. MANTÉN PRESIONADO EL BOTÓN DE DISPARO para mover el muro en la dirección de tu retícula.",
                "Coloca al INSTANTE un marcador en la ubicación de Phoenix. Cuando esta habilidad esté activa, morir o dejar que el temporizador expire hará que la habilidad se termine y regresará a Phoenix a esa ubicación con toda su vida.", " El poder estelar de Phoenix se manifiesta en su estilo de combate al incendiar el campo de batalla con sus granadas aturdidoras y cegadoras. Sin importar si cuenta con apoyo o no, participará en la batalla bajo sus propios términos.", "ttJMFW2wUQM","phantom","mphoenix");

        Agente sageAgent = new Agente("Sage", "centinela", "China", "sagef",
                "sage", "hsage1", "hsage2", "hsage3",
                "hsage4", "EQUIPA un orbe de ralentización y DISPARA para lanzarlo. Este detonará al caer al suelo y creará un campo que permanecerá en la zona y ralentizará a los jugadores que estén dentro de él.", "EQUIPA un orbe curativo y DISPARA tras apuntar a un aliado herido para curarlo con el tiempo. Usa el DISPARO SECUNDARIO cuando Sage esté herida para curarla con el tiempo.","EQUIPA un orbe de barrera. DISPARA para colocar una pared sólida. Usa el DISPARO SECUNDARIO para rotarla antes de crearla.",
                "EQUIPA una habilidad de resurrección y DISPARA mientras apuntas hacia un aliado muerto para comenzar a resucitarlo. Tras un breve periodo de canalización, el aliado revivirá con toda su vida.", "Gracias a su capacidad de revivir a sus compañeros caídos y evitar ataques agresivos, les da un lugar de protección en medio de la caótica pelea.", "1aRwM_QsqQI","spectre","msage");

        Agente sovaAgent = new Agente("Sova", "iniciador", "Rusia", "sovaf",
                "sova", "hsova1", "hsova2", "hsova3",
                "hsova4", "EQUIPA un arco con un proyectil eléctrico y DISPARA para lanzarlo. El proyectil detonará al impactar y dañará a los jugadores cercanos. MANTÉN PRESIONADO EL BOTÓN DE DISPARO para aumentar el alcance del proyectil. Usa el DISPARO SECUNDARIO para añadir hasta dos rebotes a su trayectoria", "EQUIPA un arco con un proyectil rastreador y DISPARA para lanzarlo. El proyectil se activará al impactar y revelará la ubicación de los enemigos cercanos que estén dentro de su alcance. MANTÉN PRESIONADO EL BOTÓN DE DISPARO para aumentar el alcance del proyectil. Usa el DISPARO SECUNDARIO para añadir hasta dos rebotes a la trayectoria de la flecha","EQUIPA un dron búho y DISPARA para desplegarlo y controlar su movimiento. Mientras lo controlas, DISPARA para lanzar un dardo marcador que revelará la ubicación de cualquier jugador al que impacte.",
                "EQUIPA un arco con tres ráfagas de energía de largo alcance que atraviesan las paredes. DISPARA para lanzar una ráfaga de energía frente a Sova que infligirá daño y revelará la ubicación de los enemigos impactados. Puedes VOLVER A USAR esta habilidad hasta dos veces más mientras su contador esté activo.", "Su arco personalizado y sus increíbles habilidades de exploración impedirán que sus enemigos puedan esconderse de él.", "OZ76UP-c8Ao","marshal","msova");

        Agente viperAgent = new Agente("Viper", "controlador", "Estados Unidos", "viperf",
                "viper", "hviper1", "hviper2", "hviper3",
                "hviper4", "EQUIPA un emisor de gas y DISPARA para lanzarlo. Este permanecerá ahí durante toda la ronda. VUELVE A USAR la habilidad para crear una nube de gas tóxica que usa combustible. Puedes VOLVER A USAR esta habilidad varias veces y puedes recuperarla para VOLVER A DESPLEGARLA.", "EQUIPA un lanzador de gas y DISPARA para desplegar una larga hilera de emisores de gas. VUELVE A USAR la habilidad para crear un muro de gas tóxico que usa combustible. Puedes VOLVER A USAR esta habilidad varias veces.","EQUIPA un lanzador de químicos. DISPARA para lanzar un contenedor que se rompe al impactar contra el suelo. Este crea una zona química que permanece en el campo, la cual daña y ralentiza a los enemigos.",
                "EQUIPA un rociador y DISPARA para lanzar una nube de químicos en todas las direcciones alrededor de Viper, lo que crea una gran nube que reduce el alcance de visión y la vida máxima de los jugadores que estén dentro de ella.", " Si las toxinas no asesinan a su presa, sin duda lo harán sus juegos mentales.", "9dOSy0EhLfQ","phantom","mviper");

        Agente cypherAgent = new Agente("Cypher", "centinela", "Marruecos", "cypherf",
                "cypher", "hcypher1", "hcypher2", "hcypher3",
                "hcypher4", "Lanza AL INSTANTE una ciberjaula frente a Cypher. Actívala para crear una zona que bloquea la visión y ralentiza a los enemigos que la atraviesan.", "EQUIPA una cámara espía. DISPARA para colocarla en la ubicación seleccionada. VUELVE A USAR esta habilidad para tomar el control de la vista de la cámara. Mientras la controlas, DISPARA para lanzar un dardo marcador que revelará la ubicación de cualquier jugador al que impacte.","EQUIPA un cable trampa. DISPARA para colocar un cable trampa destructible y camuflado en la ubicación seleccionada que creará una línea entre ese lugar y la pared opuesta. Los jugadores enemigos que activen el cable trampa quedarán atados, revelados y aturdidos tras un momento si no destruyen el dispositivo a tiempo. Puedes recogerlo y VOLVER A COLOCARLO.",
                "Apunta hacia un jugador enemigo muerto y úsalo DE INMEDIATO para revelar la ubicación de todos los jugadores enemigos con vida.","No hay secreto que no descubra ni maniobra que no detecte. Cypher siempre está vigilando.", "SgbqFtRRgLA","phantom","mcypher");

        Agente reynaAgent = new Agente("Reyna", "duelista", "Mexico", "reynaf",
                "reyna", "hreyna1", "hreyna2", "hreyna3",
                "hreyna4", "Los enemigos eliminados por Reyna dejan orbes de almas que duran 3 seg. Consume al INSTANTE un orbe de almas cercano y la cura rápidamente durante un breve momento. La Vida superior a 100 que obtenga mediante esta habilidad se deteriorará con el tiempo. Si LA EMPERATRIZ está activa, lanzará automáticamente esta habilidad sin consumir el orbe.", "Consume al INSTANTE un orbe de almas cercano para volverse intangible durante un breve momento. También se vuelve invisible si LA EMPERATRIZ está activa.","EQUIPA un ojo destructible y etéreo. ACTÍVALO para lanzarlo a una corta distancia y todos los enemigos que lo vean se ofuscarán.",
                "Entra al INSTANTE en un frenesí, lo que aumenta considerablemente la velocidad de disparo, equipamiento y recarga. Al lograr un asesinato, se restablece la duración.", " Su letalidad solo está limitada por tu destreza al usarla, por lo que su eficacia dependerá mucho de ello.", "IzsQNYrq9AM","vandal","mreyna");

        Agente killjoyAgent = new Agente("Killjoy", "centinela", "Alemania", "killjoyf",
                "killjoy", "hkilljoy1", "hkilljoy2", "hkilljoy3",
                "hkilljoy4", "EQUIPA un Alarmabot encubierto. DISPARA para desplegar un bot que caza a los enemigos que entren en su alcance. Después de alcanzar a su objetivo, el bot explota, lo que inflige daño y aplica Vulnerable. MANTÉN PRESIONADO EQUIPAR para recuperar un bot desplegado.", "EQUIPA una Torreta. DISPARA para desplegar una torreta que les dispara a los enemigos cercanos en un cono de 180 grados. MANTÉN PRESIONADO EQUIPAR para recuperar una torreta desplegada.","EQUIPA una granada de Nanoplaga. DISPARA para lanzar la granada. La Nanoplaga queda encubierta al aterrizar. ACTIVA Nanoplaga para desplegar un mortal enjambre de nanobots.",
                "EQUIPA el Dispositivo Inmovilizador. DISPARA para desplegar el dispositivo. Tras cargar, el dispositivo detiene a todos los enemigos dentro de su radio. Los enemigos pueden destruir el dispositivo.", "Si el daño que inflige su equipamiento no detiene a sus enemigos, la debilitación de sus robots la ayudarán a aniquilarlos.", "ckKA_A1xC_0","vandal"," ");

        Agente skyeAgent = new Agente("Skye", "iniciador", "Australia", "skyef",
                "sky", "hskye1", "hskye2", "hskye3",
                "hskye4", "TE EQUIPAS un artefacto de tigre de Tasmania. DISPARA para enviar y tomar el control del depredador. Mientras lo controlas, DISPARA para saltar hacia adelante, lo que provoca una explosión contusiva e inflige daño a los enemigos alcanzados directamente.", "TE EQUIPAS un artefacto de halcón. DISPARA para enviarlo hacia adelante. MANTÉN PRESIONADO EL DISPARO para guiar al halcón en la dirección de tu retícula. REUTILÍZALA mientras el halcón está en vuelo para transformarlo en un destello que lanza un sonido de confirmación si un enemigo estaba dentro del alcance y campo visual.","TE EQUIPAS un artefacto de curación. MANTÉN PRESIONADO EL DISPARO para canalizar, lo que cura aliados dentro del alcance y campo visual. Se puede reutilizar hasta que se agote la energía de curación. Skye no puede curarse a sí misma.",
                "TE EQUIPAS un artefacto de buscador. DISPARA para enviar tres buscadores a rastrear a los tres enemigos más cercanos. Si un buscador alcanza su objetivo, lo ofusca.", "Con sus creaciones que obstaculizan al enemigo y su poder para sanar a los demás, los equipos serán más fuertes y seguros al lado de Skye.", "s7sAeO3-T-8","guardian"," ");

        Agente yoruAgent = new Agente("Yoru", "duelista", "Japon", "yoruf",
                "yoru", "hyoru1", "hyoru2", "hyoru3",
                "hyoru4", "EQUÍPALO para arrancar un fragmento dimensional inestable de la realidad. DISPARA para lanzar el fragmento, lo que activa un destello que termina una vez que choca con una superficie dura en el mundo", "EQUÍPALO para usar un vínculo dimensional. DISPARA para lanzar el vínculo. Usa el DISPARO SECUNDARIO para colocar un vínculo en el lugar. ACTÍVALO para teletransportarte a la ubicación del vínculo.","EQUIPA un eco que imita el sonido de pisadas cuando se activa. DISPARA para activarlo y enviar el eco hacia adelante. Usa el DISPARO SECUNDARIO para colocar un eco en el lugar. USA el eco inactivo para enviarlo hacia adelante.",
                "EQUIPA una máscara que puede ver entre dimensiones. DISPARA para viajar hacia la dimensión de Yoru, donde los enemigos no pueden afectarlo o verlo desde el exterior", "Con engaños y agresividad por igual, sorprende a sus objetivos antes de que sepan dónde buscarlo.", "c_-y7aY89ss","stinger"," ");

        Agente astraAgent = new Agente("Astra", "controlador", "Ghana", "astraf",
                "astra", "hastra1", "hastra2", "hastra3",
                "hastra4", "Coloca estrellas en Modo Astral (X) ACTIVA una estrella para detonar un Pulso Estelar. El Pulso Estelar carga brevemente y luego ataca, lo que aturde a todos los jugadores en el área.", "Coloca estrellas en Modo Astral (X) ACTIVA una estrella para transformarla en una Nebulosa (humo). Usa (F) en una estrella para Disiparla, lo que devuelve la estrella para colocarla en una nueva ubicación después de un momento. Disipar forma una Nebulosa falsa brevemente en la ubicación de la estrella antes de regresar.","Coloca estrellas en Modo Astral (X) ACTIVA una estrella para formar un Pozo Gravitacional. Los jugadores en el área son atraídos hacia el centro antes de que estalle, lo que causa que todos los jugadores que aún siguen atrapados se vuelvan frágiles.",
                "CTIVA (X) para entrar en Modo Astral donde puedes colocar estrellas con tu DISPARO PRINCIPAL. Puedes reactivar las estrellas más tarde, lo que las transforma en un Pulso Estelar, Nebulosa o Pozo Gravitacional. Cuando División Cósmica esté cargada, usa el DISPARO SECUNDARIO en Modo Astral para comenzar a apuntar, luego el DISPARO PRINCIPAL para elegir dos ubicaciones. Una División Cósmica infinita conecta los dos puntos que selecciones. División Cósmica bloquea las balas y amortigua considerablemente el audio.", "Con pleno dominio de su forma astral y un talento para una profunda previsión estratégica, siempre está eones por delante del próximo movimiento de su enemigo.", "n7l-m4IBPsI","sheriff"," ");

        Agente kayoAgent = new Agente("Kay/o", "iniciador", "Maquina", "kayof",
                "kayo", "hkayo1", "hkayo2", "hkayo3",
                "hkayo4", "EQUIPA una granada cegadora. DISPARA para lanzarla. La granada cegadora explota después de un breve tiempo y ciega a todos en la línea de visión.", "EQUIPA una cuchilla de supresión. DISPARA para lanzarla. La cuchilla se pega contra la primera superficie que toca, luego explota y suprime a cualquier oponente que se encuentre en el radio de la explosión.","EQUIPA un fragmento explosivo. DISPARA para lanzarlo. El fragmento se pega al piso y explota varias veces, lo que inflige daño casi mortal en el centro con cada explosión.",
                "Se sobrecarga AL INSTANTE con energía de radianita polarizada que le da poder a KAY/O y causa que grandes pulsos de energía emanen desde su ubicación. Los enemigos impactados por dichos pulsos quedan suprimidos durante un breve momento.", " Su poder para suprimir las habilidades enemigas neutraliza la capacidad de sus rivales para contraatacar, un aspecto que le da a él y a sus aliados la ventaja definitiva en la batalla.", "AUfDJAn3Upw","judge"," ");


        Agente chamberAgent = new Agente("Chamber", "centinela", "Frances", "chamberf",
                "chamber", "hchamber1", "hchamber2", "hchamber3",
                "hchamber4", "ACTÍVALA para equipar una pistola pesada. Presiona DISPARO SECUNDARIO con la pistola equipada para usar la mira.", "COLOCA dos teletransportadores. Mientras estés en el suelo y dentro de su zona de alcance, podrás REACTIVAR la habilidad para transportarte rápidamente al otro teletransportador. Puedes recogerlos para VOLVER A COLOCARLOS en otro lugar.","COLOCA una trampa que escanea los alrededores buscando enemigos. Cuando un enemigo visible entra en contacto, esta comienza una cuenta regresiva que, al terminar, desestabiliza el terreno a su alrededor y crea un área que permanece en la zona y ralentiza a los enemigos dentro de ella.",
                "ACTÍVALA para invocar un poderoso rifle de francotirador personalizado que mata a cualquier enemigo al que impacte directamente. Matar a un enemigo crea un área que permanece en la zona y ralentiza a los jugadores que queden dentro de ella.", "Es un papucho bien vestido y bien armado, el diseñador de armas francés Chamber repele agresores con una precisión mortal. ", "Xusqu73dxRM","operator"," ");

        Agente neonAgent = new Agente("Neon", "duelista", "Filipinas", "neonf",
                "neon", "hneon1", "hneon2", "hneon3",
                "hneon4", "Lanza un rayo de energía INSTANTÁNEO que rebota una vez. Luego de golpear cada superficie, el rayo electrifica el terreno debajo, lo que provoca una explosión conmocionante.", "Canaliza INSTANTÁNEAMENTE el poder de Neon para aumentar su velocidad. Al cargarse, utiliza el DISPARO SECUNDARIO para activar un deslizamiento eléctrico. La carga del deslizamiento se reinicia cada dos asesinatos.","DISPARA dos líneas de energía hacia adelante por el suelo que se extienden por una corta distancia o hasta golpear contra una superficie. Las líneas se convierten en paredes de electricidad estática que bloquean la visión y dañan a cualquier enemigo que quiera atravesarlas.",
                "Desata todo el poder y la velocidad de Neon por un tiempo corto. DISPARA para canalizar todo su poder en un rayo mortal con gran precisión de movimiento. La duración se reinicia con cada asesinato.", "Se adelanta velozmente a sus enemigos para atraparlos desprevenidos y luego los fulmina más rápido que un rayo.", "yW4fqAhETp8","phantom"," ");








        astra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(astraAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        breach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(breachAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        brimstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(brimstoneAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        chamber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(chamberAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        cypher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(cypherAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(jettAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        kayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(kayoAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        killjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(killjoyAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(neonAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        omen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(omenAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        phoenix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(phoenixAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        raze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(razeAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(reynaAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(sageAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(skyeAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        sova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(sovaAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        viper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(viperAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });

        yoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pasamos el objeto Agente con un intent
                Intent intent = new Intent(seleccionAgentes.this,agenteDescripcion.class);
                Gson gson = new Gson();
                String myJson = gson.toJson(yoruAgent);
                intent.putExtra("agente", myJson);

                startActivity(intent);
            }
        });
    }
}