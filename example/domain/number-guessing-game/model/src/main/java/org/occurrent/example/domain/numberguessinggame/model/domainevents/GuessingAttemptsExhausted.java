/*
 * Copyright 2020 Johan Haleby
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.occurrent.example.domain.numberguessinggame.model.domainevents;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class GuessingAttemptsExhausted implements GameEvent {
    private final UUID eventId;
    private final LocalDateTime timestamp;
    private final UUID gameId;

    public GuessingAttemptsExhausted(UUID eventId, UUID gameId, LocalDateTime timestamp) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.gameId = gameId;
    }

    @Override
    public UUID eventId() {
        return eventId;
    }

    @Override
    public LocalDateTime timestamp() {
        return timestamp;
    }

    @Override
    public UUID gameId() {
        return gameId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuessingAttemptsExhausted)) return false;
        GuessingAttemptsExhausted that = (GuessingAttemptsExhausted) o;
        return Objects.equals(eventId, that.eventId) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(gameId, that.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, timestamp, gameId);
    }

    @Override
    public String toString() {
        return "GuessingAttemptsExhausted{" +
                "eventId=" + eventId +
                ", timestamp=" + timestamp +
                ", gameId=" + gameId +
                '}';
    }
}