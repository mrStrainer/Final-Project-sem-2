package DBLayer;

import ModelLayer.PhotoAlbum;

import java.util.ArrayList;

/**
 * Created by atee on 2017.06.02..
 */
public interface IFDBPhotoAlbum {
    public ArrayList<PhotoAlbum> getAllPhotoAlbums(boolean retriveAssociation);
    public PhotoAlbum findPhotoAlbum(int id, boolean retriveAssociation);
    public int insertPA(PhotoAlbum pa) throws Exception;
    public int delete(int id);
}
