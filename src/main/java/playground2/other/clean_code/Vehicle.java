package playground2.other.clean_code;

import java.util.Optional;

public interface Vehicle {
    void start();
    void stop();

    Optional<CarAudioSystem> getCarAudioSystem();

    void turnOnFogLights();
    void turnOffFogLights();
}
