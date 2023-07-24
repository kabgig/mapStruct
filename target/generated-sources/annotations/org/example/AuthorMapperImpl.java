package org.example;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-24T20:53:12+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
*/
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDto entityToDto(Author entity) {
        if ( entity == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setFirstName( entity.getAuthorFirstName() );
        authorDto.setLastName( entity.getAuthorLastName() );
        authorDto.setBiography( entity.getAuthorBiography() );

        return authorDto;
    }

    @Override
    public Author dtoToEntity(AuthorDto dto) {
        if ( dto == null ) {
            return null;
        }

        Author author = new Author();

        author.setAuthorFirstName( dto.getFirstName() );
        author.setAuthorLastName( dto.getLastName() );
        author.setAuthorBiography( dto.getBiography() );

        return author;
    }
}
