package com.securenotes.prj.services;

import com.securenotes.prj.models.Note;

import java.util.List;

public interface NoteService {
    Note createNoteForUser(String username, String content);

    Note updateNoteForUser(Long noteId, String content, String username);

    void deleteNodeForUser(Long noteId, String username);

    List<Note> getNotesForUser(String username);
}
