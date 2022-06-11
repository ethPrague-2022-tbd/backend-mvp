package org.example.model;

import java.util.UUID;

public record User(UUID id, String name, String nickname, String shortBio) {

}
