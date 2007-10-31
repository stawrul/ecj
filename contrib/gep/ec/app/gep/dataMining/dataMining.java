/*
 * Copyright (c) 2006 by National Research Council of Canada.
 *
 * This software is the confidential and proprietary information of
 * the National Research Council of Canada ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into
 * with the National Research Council of Canada.
 *
 * THE NATIONAL RESEARCH COUNCIL OF CANADA MAKES NO REPRESENTATIONS OR
 * WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT.
 * THE NATIONAL RESEARCH COUNCIL OF CANADA SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 *
 */

package ec.app.gep.dataMining;

import ec.*;
import ec.gep.*;
import ec.simple.*;
import ec.util.*;

/**
 * @author Bob Orchard
 *
 */

public class dataMining extends GEPProblem implements SimpleProblemForm 
{
	public double d0[] = { -6.366241, 2.627411, 9.978974, 5.971894, 10.045867, 8.796814, 10.97699, 10.494781, -8.585083, -1.041687, 4.502228, 8.580048, -5.118499, 10.252533, -8.304657, 0.368347, 0.586304, 3.820099, 10.696961, 1.000335, 5.669892, -0.198364, -0.352295, -6.383423, -7.727051, -6.662232, -1.311798, -4.642243, -1.463928, 6.569122, 5.959076, 4.364441, 1.599854, -1.363678, 0.600983, 2.777283, 2.604981, 6.679962, 1.754486, 6.736939, 0.692047, 10.840729, 10.560242, -3.616028, -6.998353, 10.259216, 2.158874, 10.85904, 0.674469, 3.076049, -0.30899, 8.302795, 0.851075, -8.568146, -0.702728, 9.855805, -5.32785, 10.467255, 0.118286, -7.341247, 0.27829, 1.322876, 3.294678, -3.147796, -4.189911, 2.139343, 6.967103, 0.576813, 0.408234, -5.942749, 9.276123, 2.973237, -4.786682, -6.782715, 10.362396, 3.182037, -2.634064, 0.760041, 8.366546, 1.343872, 6.006774, -5.173858, 2.429199, -3.400604, 1.276397, -5.443787, -6.309021, 5.089172, 1.315491, -1.909119, -1.707489, 9.953888, 5.264648, 6.57077, -2.62558, 7.334106, -6.735535, -1.863495, 8.077362, -2.629517, 3.455627, -8.071319, -8.458099, -0.796326, -5.02127, 5.087982, 5.908692, 10.974244, 6.974366, 0.755005, 9.318359, -7.177154, -2.416778, -5.929627, 1.91153, 3.890137, 6.945862, 6.174713, 2.828827, 1.316681, -5.797028, -3.791352, -8.789124, 6.243164, -2.504852, 1.312805, 5.198303, -1.18985, -2.037017, 3.627808, 4.931763, -5.841706, -8.252838, -0.70575, 8.551819, -4.571747, -0.011718, 8.45282, -3.800873, -1.23941, 0.826935, 10.24411, 5.014312, 3.295959, -6.596192, 4.808747, -3.862, 10.175018, -2.140533, 9.287353, 7.710816, -1.46167, -8.665405, 3.820557, -0.126617, 4.526581, -5.030212, 7.548981, 8.766327, 9.280334};	
	public double d1[] = { 6.360657, 1.452393, 0.112945, -8.606659, -6.249206, -5.951111, -3.442596, 7.952301, 10.315918, -3.863251, 7.309601, -1.864563, 9.321625, -1.018402, 7.635193, -5.791596, 2.033508, -8.15094, 7.799805, 7.436768, 1.717255, 8.00476, -1.930939, 10.086212, -1.361542, 0.714325, -8.291412, -5.577698, 1.062713, -0.756623, 0.984009, 10.710694, 6.255707, -4.142456, -6.83902, 9.217041, 1.483002, 0.822419, 4.505066, 4.206909, 0.010284, 7.403686, 4.281921, 5.945984, -4.896851, 6.866944, 4.757172, 5.699829, -4.972809, 10.477814, -1.803559, -3.265899, -6.951905, 9.501923, -5.134643, 7.314453, 0.431457, -2.795105, 5.029541, -7.293548, 10.442871, 2.852356, 4.954651, 1.175781, -8.651978, -0.290069, 1.90625, 7.988007, -2.587494, -2.956757, 8.149994, 1.408783, -1.098083, 8.117889, -3.048492, -5.296234, 5.081939, 5.199554, -1.423584, -1.861481, -6.78183, -0.446167, 3.290344, 4.97873, 10.576202, 0.44635, 5.358917, 5.48996, 10.421722, 2.14273, -3.95221, -8.062133, 3.020294, -3.0914, 4.622528, -5.411896, 1.637604, -7.990418, 4.348785, 6.706238, -3.460754, 3.711304, 7.492187, -0.442047, -0.009185, 0.279388, 3.318359, 3.408813, 1.257995, -4.020568, 5.092926, -8.475525, -3.393616, -0.922883, 4.081512, -5.829407, -6.698425, 2.838044, -6.450226, 2.612732, 4.609253, 0.527832, 0.763275, 10.116546, 2.795014, 0.412109, 0.987671, 7.947693, -2.87555, -2.243499, 3.488586, 5.371734, 1.863251, 0.82663, 1.531647, -2.345642, 6.277008, 1.888123, 6.382477, -7.938874, 3.631317, -5.793396, 9.306701, 3.857697, 4.191864, 8.047699, 1.569977, 2.309723, 0.224212, -4.322998, -4.562134, 0.68277, 4.99405, 7.360199, 0.176025, 9.242523, 6.766968, -4.637116, -8.949921, 0.254547 };
	public double d2[] = { -1.905152, 1.822663, 0.798554, -1.018249, 8.987732, 8.088195, 4.211181, 2.940857, 1.517731, -0.161499, 3.456207, 3.580017, 1.075439, -3.535797, 0.924286, 4.289917, -7.948456, 5.355926, 0.006073, 8.461121, -1.16336, -8.095672, 7.092132, 0.484314, 1.82135, -3.500031, 5.57312, 5.750061, 9.396301, 5.533508, -1.160339, 5.649048, 3.952088, 2.395569, 9.282409, 5.571869, 9.879395, -7.523224, 4.291931, 10.909119, 9.568817, -1.832245, 6.25888, 2.051483, 9.41098, 3.859131, 0.573914, 7.389526, -7.203491, -6.058471, 8.627594, 8.313934, 1.115997, -8.194427, -3.189422, 10.215271, 3.760132, 2.841889, 7.513489, -3.515778, 0.119506, 9.441101, 6.126983, 10.511353, -2.415253, -2.006164, -3.958374, -2.312652, -2.453552, 9.890717, 2.648071, 0.402771, 4.395294, 10.522369, 7.336975, 4.048309, 4.521881, 3.279419, -2.501099, -5.985474, 0.316833, -5.44751, -5.475494, -8.307892, -5.829224, 5.732208, 2.804413, 2.471619, -6.525696, 0.209198, 7.729279, 10.743744, 0.618103, 6.374084, -7.310333, -1.100921, -7.23200000000002E-03, 4.617493, 1.076232, -7.671784, -6.011077, 0.330047, -1.720398, -4.578156, 8.997162, -3.097625, 7.69043, 10.570526, 7.408173, -2.274902, -7.30072, 3.164947, -4.387451, 7.188842, -1.303192, -1.404327, -4.999085, -7.315765, 8.073669, -1.746613, -8.036102, -6.398102, 6.220428, 6.528656, 7.89209, -3.667542, -2.472259, 9.812165, 8.176178, 4.26654, 4.38623, 9.494476, -1.793244, 2.79477, -7.813446, -8.033721, 0.374451, -5.69223, 4.319275, -0.381866, -0.930115, 3.196197, 6.175049, -3.159271, -0.316345, -4.149383, 0.144531, 7.024627, 3.606445, -7.338318, -8.381714, -3.439484, -2.771149, -0.979981, 2.986969, 7.83899, 2.941498, 0.316253, 0.641205, 3.250641 };
	public double d3[] = { 10.546631, -7.722412, 5.401337, -2.949036, -4.734253, 9.991242, 7.079284, 0.287903, 0.281402, -5.369659, -1.188446, 1.208099, 0.109222, 5.710541, -6.88617, -2.672852, -5.735169, -0.252594, 9.501678, 2.160736, -2.736145, -8.743408, 3.490784, -4.775543, 6.621918, -1.246246, -7.403259, -8.966065, -0.145355, -1.245544, -7.664856, 8.104797, 10.477661, 5.774353, 0.221679, 0.952637, -1.993409, -1.670899, -8.228088, 7.093139, -2.042938, -7.065734, 2.501526, 3.0419, 5.844696, 4.105499, -7.073913, 5.314544, 0.185119, -8.641571, -3.438721, -8.573303, -3.506042, 9.208709, 9.922669, -3.106048, -8.713135, -4.828095, 9.52594, -2.768006, 1.079406, 5.763672, -6.113342, -8.043579, 3.387237, -3.500336, -1.479492, -5.417145, -6.274017, 5.895447, -1.056915, 2.626892, 8.611267, 7.466675, -7.330017, -6.395782, 5.558716, 0.729004, -4.783112, 2.030426, 0.083953, 1.197998, 5.099365, 8.421142, 9.702606, 5.389313, -1.1669, 5.291992, 9.930298, 10.818573, 10.933655, -8.841431, -2.717346, -8.998566, -1.083282, 2.53656, 9.275299, 6.453461, -0.702149, -4.058441, 2.423859, -8.309692, 8.592743, 5.889191, -6.756043, 2.22763, 4.316986, -8.104919, -1.74878, -2.419006, 1.986176, 8.474823, -6.038726, 10.266052, -1.884003, -5.855896, -4.11026, 0.798462, 10.222015, 3.418518, 0.552246, 3.693787, -5.180084, -5.18631, 6.464416, -3.532318, 6.425262, 2.845246, 9.141876, -5.364227, 3.553742, 4.028778, 5.10025, -4.286285, 2.720917, -1.120025, -7.144806, -4.782929, 0.442474, -0.085571, 4.922272, 10.661499, -7.766022, 2.647766, 0.817139, -1.437347, -4.388885, 7.595612, -4.944581, -5.563904, 6.089477, 9.273559, 5.15274, -3.202514, 1.184662, 5.197296, 10.624725, 0.162475, -1.587647, 10.882416 };
	public double d4[] = { -1.772614, 10.993683, -6.263427, 5.153595, 9.09851, -7.418701, 8.76828, -1.018096, 4.700958, 1.560455, 2.351654, -7.977967, -4.324585, 7.571747, 6.127319, -2.085388, 9.662445, -0.744232, 8.735901, 2.300293, -3.697296, 5.253204, -2.181976, -1.180359, 3.236847, -3.795349, 1.014312, -8.886689, 2.105438, 0.750733, -8.034637, -8.17807, 0.549164, 4.532043, -4.688141, 8.586121, 8.208587, 1.18927, 2.694397, -8.953461, -6.275604, -1.636994, 2.753601, 9.84375, 4.737152, 3.693848, 3.130096, 10.618408, -6.112457, 7.82248, -4.535492, 3.011138, 5.816132, -0.610504, 6.397461, 0.662567, -7.836426, 6.035491, 6.56958, 6.213348, 2.570526, -0.598847, 4.621491, -6.695954, 4.677551, 6.127075, 8.193817, 8.575317, 8.125335, -2.146148, 8.927185, 1.667786, 2.554443, 0.222168, -6.537781, 2.222076, -3.39444, 5.87262, -7.560455, 0.878846, -2.080749, 1.445801, -5.500214, 1.278656, -2.8638, -1.417602, 8.283569, -1.937836, 2.896973, 1.923005, 3.431518, -1.130005, 3.842224, 4.108245, 8.584259, 10.342773, 10.61261, -5.221283, -6.617615, 3.121124, 10.848694, -0.424896, 5.466583, 8.845703, -6.808838, 10.138, -3.522553, -7.842926, 7.280578, -5.891999, -7.944397, 4.695893, 3.75763, 2.125793, 4.841675, -4.897217, 9.262878, 2.831971, 0.476288, -6.981629, -5.563019, 4.867127, -8.399933, 5.083313, 6.920594, -3.128051, 3.853638, 3.938172, -2.645722, 7.48703, 8.877625, -3.776398, -6.621277, 7.352966, -5.687348, -8.419769, 4.634491, 5.110443, 9.799347, -0.351318, 0.762268, 9.400055, 3.978333, 6.06961, 10.402618, 9.862427, 5.490234, 5.483582, 2.196228, -5.861847, 4.975678, 3.53125, 6.783661, -6.13208, 10.075286, 10.853241, 10.805573, -5.307678, 10.429687, -5.909821 };
	public double d5[] = { 8.063385, -2.288757, 3.121338, -8.928772, -5.255218, -3.267944, -6.970612, 9.039367, 2.570862, 0.838929, -2.535095, 3.47641, -1.692749, 9.797516, -0.806427, -4.852021, 0.719574, 7.373443, -1.019042, 4.819672, -7.426544, -4.667664, -2.407257, -4.742829, -5.365478, -7.56015, -2.205505, 6.226074, 8.668396, 2.461548, 0.351868, 0.491974, -3.559296, 7.163086, 7.030517, 0.820557, -0.282928, 7.310089, 1.596008, 6.977417, -1.736908, 4.668213, 2.814026, 0.72815, -3.155548, 0.003021, -7.549866, 3.83844, -5.773255, -2.919831, -6.729981, -1.926117, -6.824402, -5.334717, 6.039245, 4.200103, -4.543366, -3.476013, -6.476501, 5.982697, 1.83548, 1.421936, -4.511658, 2.187347, -4.922242, -4.875306, -5.300537, -2.420349, -4.050903, -3.602081, -8.077575, 9.925202, 5.215118, 5.007232, 9.922883, 2.989686, 5.641449, 7.718262, 8.466492, -1.461304, -6.28600000000001E-03, 1.296661, 10.318817, -2.66214, 5.037536, -8.492004, -2.754456, 0.152771, 8.538544, -4.88208, 10.012237, -8.250885, 7.262359, -1.10794, -8.615418, 10.892487, 5.97461, -0.403961, 1.128143, -0.65152, 3.440918, 0.995514, 3.008605, -0.117218, 3.42691, 3.856049, -1.208465, -7.739014, 7.698212, -8.056701, 5.242614, 0.248687, -4.979554, 4.022888, 9.127411, 2.611572, 10.15924, 3.860443, 10.211578, 4.115234, -7.119781, -7.778382, 9.260772, 4.525299, 4.949006, 9.871979, 9.040557, 5.607361, 7.131225, -0.422821, -8.68338, 8.127105, 3.192474, 1.102844, -2.145477, -3.149871, -5.101562, -0.785401, 7.419952, 8.542023, 0.014709, -7.321899, 4.778473, 7.968476, 3.306915, 2.258911, 9.69577, -3.104919, 5.54068, -6.277313, 4.937409, -5.912537, 8.481628, 4.835053, 10.269073, 3.311218, -6.104614, -0.638367, 9.456329, 6.332031 };
	public double d6[] = { -6.449127, 0.706574, -7.523834, 8.357879, 1.506287, 1.732178, -5.497406, -0.059173, -5.173614, 10.595093, -2.661011, -4.193634, 5.401764, 1.185943, -4.124023, 10.845154, 9.123016, 9.395355, 2.00418, -1.052154, 0.880829, 6.113952, -5.385773, -6.994996, 10.565765, 8.232361, 3.596771, 9.907288, -3.931488, 7.641174, 4.842377, 1.545349, -8.720337, 0.231079, -8.758301, 2.809754, 8.089813, -0.10733, -1.314636, 7.591156, 2.389648, -1.483429, -0.936005, 9.780213, 8.069732, -8.006591, 7.268219, 2.267486, -0.979249, -6.786194, -1.811341, 1.943634, 9.1333, -1.931641, 5.715943, 0.699311, -7.702027, 0.447754, 2.740692, -5.574921, 1.405456, -7.757416, 4.153534, -5.988404, -6.653687, 9.343475, 3.845124, -3.650482, 0.01123, 5.641052, -3.293976, -4.670593, -2.709198, -5.974061, -4.373108, 2.84195, -3.924378, 10.388763, -5.501648, -4.22229, -5.743622, 7.620117, 8.211029, 5.027343, 2.723633, 0.610687, -8.344452, 8.481506, -2.631928, 0.251068, -3.277466, -2.969239, -7.919709, 5.431885, -0.697388, 6.565765, 0.750885, 7.043762, -8.713593, 9.977173, -3.729462, 0.977326, 9.564545, 1.155548, -5.470184, 0.123169, 6.027648, -3.008453, 8.419403, -0.628021, -3.433624, 6.375824, -7.170135, 10.614349, -6.928711, 8.198944, 0.651886, 10.740906, -8.566956, -4.648438, 7.776062, -8.357727, 4.542267, 0.724335, 6.092987, 8.209076, 7.289581, -1.792176, -8.506653, -3.66806, -6.434387, 1.692688, -2.132293, 6.901459, -2.739014, 7.06958, -2.89325, -4.191681, -8.733673, 8.229065, 5.101074, -3.056884, -7.527741, -1.938202, -3.258728, 2.196472, -7.230591, 10.458435, 3.91803, 10.459015, 5.048431, 0.30954, 1.521912, -8.378631, 7.19989, 1.505768, 4.443603, 0.574127, 10.114441, 8.937775 };
	public double d7[] = { 9.848847, -1.763428, 6.934174, -8.073791, 6.103607, 10.263489, -0.890808, 9.250335, 0.202789, -8.611328, 0.136383, 8.680542, -2.838044, 5.627808, -1.968567, -3.767517, 2.996796, 1.996491, -0.190063, -2.078216, 4.72287, 5.510315, 8.487518, 0.764069, 8.355835, 3.184967, -6.920197, 9.774964, 1.911347, 1.036041, 1.602417, -6.029907, 10.404968, 7.079132, -1.929017, -1.634918, 1.852356, 6.329925, 10.501099, 9.975556, 1.269165, 6.803986, 4.908448, -5.18283, -2.32904, -5.483002, 7.308624, -0.094513, -5.926606, -5.515442, 4.717255, -8.743836, -0.507874, -5.27774, 4.149963, -2.115173, 0.942719, 1.245788, -7.377624, 2.807099, 1.440857, 1.070709, -4.849884, -5.961396, -8.997895, 1.212707, -0.25122, -0.405029, -3.357879, 8.687378, -8.565949, 3.491821, 2.376556, 7.510315, -1.778473, -5.255218, -3.779022, 6.697205, 5.126831, -1.630493, 4.19104, -8.736389, 0.165588, 0.381561, -5.697602, 8.225219, 10.353424, 8.796601, 10.570618, 4.597626, 0.705963, 9.630249, 0.011352, 6.396423, -0.7612, 9.898133, -7.359741, 0.637299, 10.967621, -4.384125, -8.5271, -5.664154, 2.90802, -7.200897, 3.524963, -6.49234, 1.075622, 8.46344, -3.187988, 3.168426, -5.513947, 10.624512, -4.650299, -7.66629, 7.154937, 3.297973, 8.153686, 6.019195, 6.0979, -4.50061, 0.239532, -7.759522, 0.330566, -7.755585, 0.622894, -3.986847, -7.131469, 0.548676, -6.680573, 5.352905, -8.272522, 5.427795, 5.344696, 5.275299, 2.923005, -2.1026, 3.714356, 2.796021, -4.529266, -1.026886, -4.555939, 5.930664, -7.613709, -1.329437, 5.549377, -0.305176, 2.685303, 1.005371, 1.045959, 10.104187, -7.616608, -2.006805, -8.050537, 4.174316, 7.496155, 8.649597, -0.724549, -8.079101, -4.960724, 4.990235 };
	public double d8[] = { -5.129089, -2.200897, -1.417602, 2.582367, 3.316803, -3.540161, 3.841736, -3.550903, 5.424713, -7.932282, 1.833374, 4.333313, -0.664704, 4.763428, 10.697998, 10.375641, 2.189117, -7.312469, 9.576202, 10.716706, -3.873169, -5.019287, -1.391388, 4.497131, -0.710938, 10.783539, -5.064178, -8.142456, 8.816468, -1.763306, -1.301483, 10.938569, 5.84961, -1.519257, 7.037292, 0.880829, 8.529144, 8.656372, 2.092773, 0.824951, -3.004302, 8.904145, 2.005554, 10.91156, 8.389923, -2.635254, 6.916321, 8.28128, 2.852387, -5.821259, -7.034332, -5.925263, 0.523743, -1.513184, 0.29422, 5.432556, -1.455383, 7.429535, 9.042572, 3.495361, -2.944336, 2.147583, -2.64859, 5.403778, -4.802552, 0.781525, 4.361328, 10.298431, -8.889374, 3.472046, 9.212951, -0.680054, 4.935822, 7.359711, -7.953125, 8.608948, -4.18631, -6.414795, 10.003784, 0.306061, 0.884797, -0.710907, 3.224273, 10.55191, 1.289795, 3.612061, 10.848969, 0.487122, -3.830689, 7.694672, -8.981537, 7.252319, 2.664002, 9.677612, 4.873444, -7.011871, 1.914429, 7.701447, 9.554504, -6.164825, -8.938752, 0.906861, 3.20227, 9.934082, -8.754914, 9.434418, 8.957337, 0.425476, 0.606598, -8.575195, 0.960389, 3.449982, -2.713654, 5.018585, 1.35202, -0.851776, 0.424988, -6.643555, 8.272857, 6.660828, 10.163147, 10.578949, 1.863495, 4.128418, 6.64148, -0.173217, -0.735382, -7.30838, 5.000549, -4.759491, 0.616821, 8.491058, 9.381012, 0.960816, 5.06073, -7.332641, -4.076507, -6.871735, -7.263061, 2.361145, 1.768647, -8.116455, 0.786133, -0.286957, 9.057037, -3.632782, 7.348907, 0.863678, -2.070678, 3.719971, -5.434112, 5.953675, 3.526123, -3.917633, -0.422333, -5.876343, 7.988099, 10.595093, 1.524933, 4.514252 };
	public double d9[] = { 9.432129, 4.796051, -1.546509, 10.1586, -2.928193, 2.759735, 0.195312, -0.24237, -6.767853, 10.810517, 8.090576, -4.923462, 10.178802, 1.213958, -8.595032, 10.380951, -1.822663, 7.235748, 2.404083, -4.063507, 9.493408, 0.141449, -8.646454, 0.008789, -5.607361, 8.196747, -8.481049, 0.863465, 6.140686, 7.667206, -6.834015, 5.766144, -3.996888, 6.818512, 8.560242, 7.982453, -4.754425, -1.08377, 9.967347, -3.221985, -4.866303, -7.773957, 6.652893, 5.418457, 7.933136, 2.013519, -7.117431, 5.169403, 3.909455, 0.544342, -2.078033, 7.296478, -3.671692, -3.915924, -5.963288, 4.065307, -4.544678, 1.898407, -6.507599, 7.741516, -6.443848, 9.252899, 7.554718, 7.590729, 0.896363, 10.413238, 7.489258, -2.121429, -8.258392, -3.355011, 5.561646, 6.870697, -5.642456, -2.786164, -7.962494, 7.832672, 2.009735, 6.385345, 0.182434, -6.969849, 7.963837, -3.574799, 0.262115, -6.27124, 0.485474, -3.401031, 3.542145, 0.194122, -6.159698, -1.827668, 2.288147, 6.691864, -2.706116, -4.589142, 9.765717, 1.48761, 3.111877, -2.419769, -5.759461, -0.153015, 4.559906, -2.053955, 9.978211, 8.035614, -8.096374, 4.773896, 5.244354, 3.319122, -3.5914, -6.670532, -3.695435, -5.036865, 9.340484, -5.121673, 10.42453, -7.766724, 3.964905, -1.313843, 1.869843, 10.395172, 9.547516, -2.981476, 0.906128, -0.285553, -0.646118, 2.141113, -0.200988, 9.456726, 4.649658, 6.319488, 8.814087, -5.112365, -3.299499, 0.819336, 0.217041, 4.272796, 6.771973, -4.09378, 7.273468, -7.122161, 7.12973, 2.845826, 0.248993, 7.968384, 9.039398, -4.096283, 9.40921, 3.810059, 3.766632, 3.345581, 7.019805, -7.331512, 3.576996, -0.563019, 6.346374, 3.809296, -0.263855, -5.556397, -2.345459, 9.498108 };
	public double d10[] = { 5.454254, 6.383484, 2.333343, -6.408783, -7.899262, -6.53833, 0.930207, -2.581329, 1.495636, 6.385986, 1.970826, -8.212494, -2.970398, -7.452972, -8.154174, 0.088378, 1.093292, -5.664612, -6.054168, 6.711914, 0.07727, -2.858246, 10.661469, -4.951264, -1.627777, 2.35672, 8.383362, 10.489471, -2.631287, -2.62912, 10.502136, -4.575226, 2.457397, 3.574921, 0.408386, -5.754792, -0.97107, 6.359436, 3.492798, -7.658569, 9.473877, 10.11502, 2.145965, -7.895935, -0.817078, -1.767639, 2.758515, -0.076263, 9.546631, -5.89795, 6.72107, -3.80893, 7.955658, 3.114685, -0.575745, 7.296722, -3.199341, 9.66095, 4.258697, -1.368744, 0.472198, -4.868561, 6.615021, -8.414673, 1.360962, 6.916748, 9.88385, -8.450439, 6.857514, 6.407562, -1.544189, 1.914582, -1.647492, -5.52299999999994E-03, -5.278473, 8.071014, 0.236603, 9.068084, 3.071594, -6.590515, -0.099639, 0.019073, 10.896698, 0.320648, -4.265533, -3.761963, -0.412567, -3.804932, -4.870514, 0.11557, -8.465576, 1.423401, 2.476105, -0.957642, -5.871704, 3.396271, 0.164886, -4.591004, 9.759674, 3.504303, -5.413513, -8.393921, 1.819184, 8.138122, 7.131561, -5.975708, -3.302551, 0.688385, 3.190674, 5.054229, -3.214905, 2.545654, 8.15451, -8.913514, 5.472748, 1.100586, 3.413635, -5.488251, 8.151031, 0.743805, -4.641297, -0.279388, 9.21054, 1.865937, 5.380371, 8.103668, -8.958039, -8.142395, 0.869202, 8.051605, 0.035888, -7.890534, 3.215881, 2.955018, -2.417053, 9.012084, -1.189026, -5.795502, 9.073761, 7.956116, 8.045135, 8.190735, -0.101043, 8.332184, -1.690979, 7.304291, -8.550842, -1.469086, -6.006805, -1.064148, 9.11499, -0.057067, -4.511658, 1.476013, -2.712921, -2.041137, 10.185028, 3.315368, 0.356048, -5.030639 };
	public double d11[] = { 1.757782, -1.931092, 2.976075, 2.56546, 5.829529, 0.666931, -0.117401, 8.187744, 2.199768, 10.442352, 6.345459, 0.245208, 9.384094, 4.910798, 1.880219, -3.74646, 2.898194, -0.412109, 1.002532, 9.728302, -0.74234, 10.989258, 2.228027, -1.81482, -5.021911, -4.369476, 1.072326, -1.86026, 5.575165, 10.027313, -4.948945, 6.107635, 10.564484, -7.304748, 0.679871, 0.604523, 3.46167, -2.850067, -8.525665, -3.854035, 2.782318, 2.907044, 7.950104, 10.24765, 4.042114, 3.482178, 3.622803, -1.57486, 4.756653, -1.609039, -2.991944, -1.805878, 0.441528, 1.149017, 3.621491, 5.070159, 7.612427, -7.728028, 0.97876, -2.431091, 3.784943, 4.275451, 5.595429, 10.206024, 5.47467, -2.32492, -6.012847, 0.49707, 8.197296, 4.986481, 0.669556, 4.957734, 9.468414, 4.725281, 4.158264, 0.103576, 4.80362, -5.592896, 0.968903, 1.450287, -7.281402, 8.547577, 7.617127, 8.513428, 7.728943, 5.662323, 0.6185, -5.191345, 7.35025, 0.266937, -3.511322, -1.148376, 7.098205, 10.877106, -8.256714, -5.842102, 5.488403, -6.991578, 1.89795, 0.243164, -1.963562, 3.176513, 4.468323, -5.377014, 1.257995, -0.102996, -2.030029, 10.81305, -7.331329, -4.314483, -4.081451, 6.328918, 6.784058, 9.057678, -4.170318, -0.313751, 0.119842, -0.470886, -6.781006, 4.400696, -7.80838, -0.384552, 7.602112, -0.012176, -1.485016, 7.832306, -6.50531, 0.963318, -6.394379, 0.695313, 6.412292, 2.842743, -4.020874, -7.279907, 5.870575, 4.141754, 0.151092, 2.422272, 6.385162, 2.376007, 4.637207, 7.317444, 4.47168, -7.938935, 5.953064, 1.921296, -1.354248, -8.287384, 0.614258, 3.74942, 1.423035, -4.153778, 3.136474, 9.317444, -5.680908, 0.97757, -6.964692, -4.859009, 10.849579, 5.622223 };
	public double d12[] = { -0.302185, 3.59375, 9.545502, -2.171264, -7.124694, 4.273407, -6.232635, -0.742157, 9.801728, -0.387848, 6.058502, -1.333618, 1.117706, -4.749359, 0.059478, 2.694946, -2.536102, 0.829438, 0.41098, 2.984162, 4.480865, 7.989197, -2.246429, 6.174652, -6.190735, 1.370544, 0.727936, 3.907013, -6.910279, -5.385864, -0.025329, 3.82193, -7.037139, -5.639465, 0.134369, -4.440002, 0.069305, 9.250396, -2.152282, 6.761841, 6.049682, 9.924378, -4.24472, 7.068084, -0.455383, 3.02304, 3.497742, 7.119354, 6.194732, 0.187042, -6.284332, -4.443756, 0.640656, 10.057037, -7.950257, -0.980561, 7.52301, 0.27359, 10.140564, 8.149536, -2.517578, 2.477356, -4.371277, -6.412842, 0.159515, 2.30899, -2.845093, 1.972931, 2.194915, -8.590942, 4.35968, 3.947449, -2.770752, -1.581787, 6.883728, 6.151397, 9.903138, -8.022888, -7.632385, 1.225372, -8.142761, 0.726319, -8.547974, -3.190002, 9.732117, -7.693512, -7.222442, 0.545898, -5.831574, 0.358246, 3.984803, 1.0737, -4.193206, 9.522247, -4.285553, -8.966004, 0.287842, 10.439056, -3.392944, -1.932526, -0.747803, -6.250671, -4.696686, 8.814728, 0.340484, 5.093719, 1.443787, -4.083618, -5.806671, -2.887207, 4.669159, 3.013061, 8.451355, -2.552795, -7.380005, 6.745362, -7.244812, -6.26239, -4.063018, 9.753968, -3.254547, -3.375427, 0.260711, 4.679474, 6.062774, -4.251251, 0.231781, -0.837494, -4.652222, -2.249206, 0.490875, 1.843689, 9.241089, -6.728729, 10.678559, 2.363617, -0.616669, -7.049163, 0.435516, -8.637024, -6.584839, 1.430145, 0.402313, -4.517639, 0.977143, -6.650238, -1.780365, 4.362396, 9.709931, -6.649658, 1.528076, 8.643707, 10.25415, -7.92746, 1.968232, -4.033081, -7.749573, -0.843079, 7.180786, -5.027374 };
	public double d13[] = { 0.457581, 3.446014, 2.159668, 6.579254, -6.908234, -6.509613, 7.974579, 5.150055, 9.028808, -7.970948, -4.02481, -6.902008, 10.034393, 0.827607, 9.927124, -7.811371, -2.125915, 0.651734, 9.596008, 3.187622, -7.686432, -6.732971, -0.252533, 9.860627, -3.881562, 1.439117, -0.852875, 10.973206, -8.94571, 6.933625, 10.560608, 9.291015, 0.886811, 9.516144, -4.24646, 6.579712, 1.381561, -8.047637, -4.508423, 3.604859, -0.69577, -5.992127, -8.459717, 2.13211, -5.57959, 0.448303, 4.665314, 5.927124, 8.495697, 10.039276, -0.367706, -6.244537, 2.295776, 5.546417, -5.793152, 7.382782, -1.413788, 8.735321, -8.845398, 9.574738, -1.86731, 0.371673, -6.75882, 1.096893, 2.700775, 2.221069, 0.232208, 4.714905, -5.943848, -1.950867, -3.106689, 0.194427, -6.035583, 5.621491, 0.990113, -8.698975, 2.191162, 8.703766, -4.711762, -1.199646, 3.502075, 8.061554, 1.553314, 1.458069, -2.33728, 6.460541, 2.550995, 4.039733, 4.438782, 4.666321, -1.953156, 7.311004, 8.595856, 4.444519, 10.806519, -6.962464, 9.899537, 6.560761, 1.595642, 2.984894, 10.115509, -6.21933, -7.82016, -1.081268, -8.990662, 6.869843, 4.324737, -0.395294, -4.65329, 6.593964, 0.79596, 9.80838, 2.893189, -2.281372, -0.640869, 9.29541, -4.585541, -2.99054, 5.779877, 0.831452, -4.323883, 10.232086, -0.176178, 5.182068, 2.443756, -2.84787, 1.256592, 4.112915, 0.483063, -0.464813, -3.156189, 0.389648, -8.440399, -1.853058, 1.351105, -6.222168, -5.560944, -3.247009, 1.544128, 5.043121, -8.113006, -5.881043, -1.811554, 0.951172, 5.669098, -6.989533, 10.049713, -3.732453, -1.449036, -3.806855, 1.893555, -3.242096, 9.298187, 3.432587, -5.514404, 1.187896, 1.676453, -1.505524, 7.591461, -5.676911 };
	public double d14[] = { 1.82312, -6.391754, -5.075653, -8.902161, 6.111389, -2.396118, -4.129486, 10.862702, 6.18811, 4.110626, -1.449524, 0.084014, -3.05606, 9.019165, -2.145172, -5.347595, 8.269501, 5.220062, 6.674256, 6.458496, -1.944581, 7.604004, 0.899353, -8.607086, -1.807648, 9.061554, -8.579254, 3.346283, 4.570862, 5.483398, -4.870972, -3.790772, 9.081604, 8.760102, 4.914887, 3.872376, 8.615204, -5.217651, -4.331085, 0.226349, -5.937684, -4.559296, 0.281708, 0.161773, 1.313507, 6.625855, -5.356048, -2.430725, 4.25943, 2.228363, 10.64624, 4.339477, -1.209289, -3.861115, 2.179199, -1.636994, -5.202026, 1.248077, 6.133422, 10.530487, 8.171875, -5.553497, -4.600403, -4.267456, -5.197021, 6.624848, 2.868317, 8.859803, 6.58194, -6.326324, 2.430206, 2.802857, -1.600617, 8.483673, 9.975861, -7.547607, 3.145935, 6.945404, -1.604035, -7.300995, -1.28775, 0.949555, 0.581116, -4.566681, -5.011108, 6.386688, -5.578095, -3.45404, 6.866516, -3.852509, 9.809021, 8.927552, 9.235748, 4.122528, 2.633057, 6.468719, -3.012756, 5.202484, 6.784638, 4.060089, 1.011566, -5.722077, -2.845642, -2.407715, -0.800629, 3.239532, 5.632904, -2.044067, 3.441284, 8.977875, 8.11087, -0.958344, 8.62793, 1.383636, -0.521149, -2.259918, 7.649964, -1.652619, -8.372467, 5.941834, -3.602051, -7.240204, -0.55249, -1.462463, 6.762543, -2.488556, -2.170593, 9.417816, -4.365631, 7.492981, -1.336181, -6.526703, -6.095916, -2.404938, -2.158569, 2.594605, -2.53775, 0.708252, 8.252838, -6.327637, 0.199524, -8.276764, 6.788666, -1.402801, -4.99347, 3.530579, 3.339508, -8.740265, -1.226104, -7.979035, -4.203949, 7.550598, 2.392273, 9.084961, -4.951111, 0.360412, 1.752228, -8.386749, -1.011383, 4.579804 };
	public double d15[] = { 2.350433, -3.51709, -1.57074, -7.372772, 7.420837, 7.060302, 1.702118, -2.590942, 2.150085, 7.800446, 0.141662, -6.138549, -4.446197, 0.718964, -0.236541, 5, -7.352386, -5.168487, 5.583191, 1.840393, 0.447144, -4.846344, 5.616425, 9.398224, 3.968018, 9.70105, 5.878846, -6.310882, -7.77414, 4.489319, -6.613983, 0.728668, 10.236297, 6.534119, -5.846375, -1.467438, 4.014953, 1.851014, -4.802765, -7.883606, 3.577454, -2.544342, 1.532532, 10.495789, -8.060577, -1.636322, 2.175079, -2.313659, -3.883515, -6.409271, 2.140564, 0.703736, 3.124267, 7.152374, 9.44455, 7.563568, 0.978394, 7.06427, 8.102722, 3.281463, -5.305511, 0.342041, 7.130645, -3.126983, 10.288177, -5.998658, -7.455994, 10.353912, -4.224914, -7.942261, 9.358368, -4.260254, -3.829163, 3.526886, 5.589417, -5.953858, 0.491058, -6.575592, 8.252716, -3.711304, -7.248626, 9.765961, 2.363953, 7.483093, 0.967408, -2.432892, -4.061309, -6.355072, 9.154785, 3.843506, -5.007385, 1.789795, 8.329132, -4.389221, 4.54129, -0.066619, 1.506073, -0.115448, -6.399597, 10.091278, -1.298767, 0.680481, 6.185516, 4.279114, 1.930237, 7.014129, -7.687683, 6.512482, 0.208709, 5.901154, -3.003631, 2.807068, 0.552277, 2.357178, 3.253326, 0.178466, 8.976563, 3.397858, 3.098846, 6.642304, -8.502808, -3.961243, 0.548492, 7.214172, -4.870209, 6.295532, 2.617951, 8.90976, 6.889985, 0.183807, -3.677216, -1.25534, -7.206604, 5.719239, 6.678681, 0.734497, -0.144348, 8.917389, 0.701203, 4.894867, -6.907624, -4.206085, 5.406036, -3.758545, 0.519196, -6.635559, 8.808747, 1.789856, 9.151733, 7.644623, -5.074981, 7.555695, 4.005584, 5.650025, 10.770417, 0.554565, -6.903565, -5.603699, 3.360626, 5.802155 };
	 // d0^4 + d0^3 + d0^2 + d0   .... 16 variables but only 1 is significant (d0)
	public double dv[] = { 1418.74707069507, 75.3238688522697, 11019.4252335609, 1526.50067316805, 11309.522753932, 6755.18648304066, 15973.0147417269, 13407.448815283, 4864.59465401323, 9.05455755978752E-02, 526.907912311984, 6133.33220719359, 573.370092271738, 12242.1001654356, 4244.40498453668, 0.572412583853862, 1.24976547510509, 287.120770258385, 14442.1962470773, 4.00335112243799, 1253.56444090473, -0.165272718159647, -0.256503457225005, 1434.65914961208, 3155.58250345331, 1712.07568532995, 1.11285643650174, 381.286495587834, 2.13464890245207, 2195.41500934451, 1514.08172118118, 469.387621677669, 14.8054739070235, 1.41819790292564, 1.3096783480239, 91.407613409357, 73.1169071528512, 2340.48767374332, 19.7088482809486, 2417.80884001462, 1.73179049775308, 15213.6605325549, 13736.1664549125, 133.150528378495, 2097.96175713425, 12273.1897094921, 38.6040236627813, 15314.0937456038, 1.64314074862652, 131.174850007017, -0.233900503289572, 5401.83194541066, 2.71651366757057, 4825.31765012274, -0.312062414150939, 10499.9307908985, 677.58604188444, 13271.0036012626, 0.134128349816399, 2555.45744088852, 0.383285361568743, 8.45041430683027, 167.741913461982, 73.7512538531452, 248.00053223041, 37.4544445651712, 2749.87694991073, 1.21213765537919, 0.670697124128519, 1066.73643550979, 8297.49302726078, 116.245245836016, 433.426248136824, 1843.66271543253, 12760.751481894, 148.049569323142, 34.1682328521057, 2.11044412820363, 5563.88913753708, 8.83849290149396, 1560.68318123594, 599.665951415891, 57.4868218221739, 102.567136894107, 7.63933641909204, 741.087771683982, 1366.71024963805, 833.589718742552, 8.31717414847486, 8.06147865419232, 4.73006280427211, 10912.0877382634, 947.104281891559, 2197.52111722567, 33.6908980815162, 3348.88669993731, 1791.26183475781, 7.19696582575098, 4857.06916442079, 33.9117858158822, 199.257893960767, 3775.28531065047, 4575.88497344131, -0.265041845128222, 529.292891192703, 832.856792218369, 1466.00188874685, 15957.4366339465, 2760.88460016948, 2.08035208354463, 8445.04419432577, 2328.06683923781, 23.4232129217027, 1057.00143720805, 25.901434383751, 306.906100905244, 2717.87388671717, 1733.39985161227, 97.5043048092466, 8.33853071989467, 962.32817695277, 162.70671498732, 5356.87292539495, 1807.77473743537, 27.4199138276061, 8.26912881356699, 902.898661374512, 0.54569949293581, 10.8777828450564, 237.746027976374, 740.779411163222, 993.48424441092, 4136.64271009512, -0.311102321709996, 6055.63545705955, 357.62202419871, -1.15822786379836E-02, 5788.98459234367, 164.441214578163, 0.75254074314618, 2.54384425751606, 12203.0003606758, 788.420895940132, 167.976727300113, 1643.01314869521, 673.852072258144, 175.909681593936, 11885.8018689667, 13.6273182204743, 8336.53443769718, 4060.72424419037, 2.11652497746334, 5054.13966658385, 287.246928505285, -0.112358021236921, 537.603328324592, 533.236668818159, 3742.26191483226, 6664.98407320731, 8312.11655791031 }; 
	
	public static final double IDEAL_FITNESS_MINIMUM = 999.99999999;
		
    public void setup(final EvolutionState state,
            final Parameter base)
    {
        super.setup(state, base);
    }

    public double [] getDataValues( String label )
    {
    	if (label.equals("d0"))
    		return (d0);
    	else if (label.equals("d1"))
    		return (d1);
    	else if (label.equals("d2"))
    		return (d2);
    	else if (label.equals("d3"))
    		return (d3);
    	else if (label.equals("d4"))
    		return (d4);
    	else if (label.equals("d5"))
    		return (d5);
    	else if (label.equals("d6"))
    		return (d6);
    	else if (label.equals("d7"))
    		return (d7);
    	else if (label.equals("d8"))
    		return (d8);
    	else if (label.equals("d9"))
    		return (d9);
    	else if (label.equals("d10"))
    		return (d10);
    	else if (label.equals("d11"))
    		return (d11);
    	else if (label.equals("d12"))
    		return (d12);
    	else if (label.equals("d13"))
    		return (d13);
    	else if (label.equals("d14"))
    		return (d14);
    	else if (label.equals("d15"))
    		return (d15);
    	else if (label.equals("dependentVariable")) // always called 'dependentVariable'
    		return (dv);
    	else
    		return null;   
    }

	public void evaluate(EvolutionState state, Individual ind, int threadnum) 
	{
        if (!ind.evaluated)  // don't bother reevaluating
        {                
            // fitness is normalized between 0 and 1000  (1000 * (1/(1+RRSE))
            double fitness = GEPFitnessFunction.RRSEfitness((GEPIndividual)ind);
                      
            // the fitness better be SimpleFitness!
            SimpleFitness f = ((SimpleFitness)ind.fitness);
            f.setFitness(state,(float)fitness, fitness >= IDEAL_FITNESS_MINIMUM);
            ind.evaluated = true;
           
			if (fitness >= IDEAL_FITNESS_MINIMUM)
			   {	
			        ((GEPIndividual)ind).printIndividualForHumans(state, 1, 1);
			   }
        }
	}

}